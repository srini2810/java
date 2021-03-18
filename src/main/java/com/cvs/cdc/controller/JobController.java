package com.cvs.cdc.controller;

import com.cvs.cdc.dto.EmployeeDTO;
import com.cvs.cdc.model.CdcResponse;
import com.cvs.cdc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cvs.cdc.runner.JobRunner;

/*
url: http://localhost:8080/run/job
 */

@RestController
@RequestMapping("/run")
public class JobController {

    private JobRunner jobRunner;

    @Autowired
    public JobController(JobRunner jobRunner) {
        this.jobRunner = jobRunner;
    }

    @RequestMapping(value = "/csvtodb")
    public String runJob() {
        jobRunner.runBatchJob();
        return String.format("Job csv to db submitted successfully.");
    }

    @RequestMapping(value = "/dbtocsv")
    public String runJobDemo3() {
        jobRunner.runBatchJobDemo3();
        return String.format("Job db to csv submitted successfully.");
    }

    @RequestMapping(value = "/cvstoapi")
    public String runJobDbToApiDemo() {
        jobRunner.runBatchJobDbtoApi();
        return String.format("Job db to api submitted successfully.");
    }

    @PostMapping(value = "/cdcinfo", consumes = "application/json", produces = "application/json", headers = "Accept=application/json")
    public CdcResponse getCdcInfo(@RequestBody EmployeeDTO employeeDTO) {
        return CdcResponse.builder().code("0").message("Successfully updated the cdc info at cdc").build();
    }

    @RequestMapping(value = "/csvtodbmultithread")
    public String runJobDemoCsvToDbMultiThread() {
        jobRunner.runBatchJobCsvToDbMultiThread();
        return String.format("Job Demo1 submitted successfully.");
    }
}