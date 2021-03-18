package com.cvs.cdc.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import com.cvs.cdc.utils.Constants;

import java.util.Date;

@Component
public class JobRunner {

    private static final Logger logger = LoggerFactory.getLogger(JobRunner.class);


    @Autowired
    private JobLauncher simpleJobLauncher;
    @Autowired
    @Qualifier("demo1")
    private Job demo1;

    @Autowired
    @Qualifier("demo3")
    private Job demo3;

    @Autowired
    @Qualifier("dbtoapi")
    private Job dbtoapi;

    @Autowired
    @Qualifier("demorunBatchJobCsvToDbMultiThread")
    private Job demorunBatchJobCsvToDbMultiThread;

   /* @Autowired

    public JobRunner(Job  demo1, JobLauncher jobLauncher) {
        this.simpleJobLauncher = jobLauncher;
        this.demo1 = demo1;
    }*/


    @Async
    public void runBatchJob() {
        JobParametersBuilder jobParametersBuilder = new JobParametersBuilder();
        jobParametersBuilder.addString(Constants.FILE_NAME_CONTEXT_KEY, "employee.csv");
        jobParametersBuilder.addDate("date", new Date(), true);
        runJob(demo1, jobParametersBuilder.toJobParameters());
    }



    @Async
    public void runBatchJobCsvToDbMultiThread() {
        JobParametersBuilder jobParametersBuilder = new JobParametersBuilder();
        jobParametersBuilder.addString(Constants.FILE_NAME_CONTEXT_KEY, "employee.csv");
        jobParametersBuilder.addDate("date", new Date(), true);
        runJob(demorunBatchJobCsvToDbMultiThread, jobParametersBuilder.toJobParameters());
    }


    @Async
    public void runBatchJobDemo3() {
        JobParametersBuilder jobParametersBuilder = new JobParametersBuilder();
        jobParametersBuilder.addDate("date", new Date(), true);
        runJob(demo3, jobParametersBuilder.toJobParameters());
    }

    @Async
    public void runBatchJobDbtoApi() {
        JobParametersBuilder jobParametersBuilder = new JobParametersBuilder();
        jobParametersBuilder.addDate("date", new Date(), true);
        runJob(dbtoapi, jobParametersBuilder.toJobParameters());
    }


    public void runJob(Job job, JobParameters parameters) {
        try {
            JobExecution jobExecution = simpleJobLauncher.run(job, parameters);
        } catch (JobExecutionAlreadyRunningException e) {
            logger.info("Job with fileName={} is already running.", parameters.getParameters().get(Constants.FILE_NAME_CONTEXT_KEY));
        } catch (JobRestartException e) {
            logger.info("Job with fileName={} was not restarted.", parameters.getParameters().get(Constants.FILE_NAME_CONTEXT_KEY));
        } catch (JobInstanceAlreadyCompleteException e) {
            logger.info("Job with fileName={} already completed.", parameters.getParameters().get(Constants.FILE_NAME_CONTEXT_KEY));
        } catch (JobParametersInvalidException e) {
            logger.info("Invalid job parameters.", parameters.getParameters().get(Constants.FILE_NAME_CONTEXT_KEY));
        }
    }


}