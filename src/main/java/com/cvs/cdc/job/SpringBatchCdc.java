package com.cvs.cdc.job;

import com.cvs.cdc.dto.EmployeeDTO;
import com.cvs.cdc.mapper.EmployeeFileRowMapper;
import com.cvs.cdc.model.CdcRequestToApi;
import com.cvs.cdc.model.CdcResponseFromApi;
import com.cvs.cdc.model.Employee;
import com.cvs.cdc.processor.CdcResponseProcessorApi;
import com.cvs.cdc.processor.EmployeeProcessorDemo3;
import com.cvs.cdc.reader.ImmunizationInfoDBReader;
import com.cvs.cdc.repo.ImmunizationInfoRepo;
import com.cvs.cdc.writer.CdcResponseDBWriter;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.data.RepositoryItemReader;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.BeanWrapperFieldExtractor;
import org.springframework.batch.item.file.transform.DelimitedLineAggregator;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import com.cvs.cdc.processor.EmployeeProcessorDemo1;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.data.domain.Sort;
import org.springframework.web.client.RestTemplate;

import javax.sql.DataSource;
import java.util.Map;

@Configuration
public class SpringBatchCdc {

    @Autowired
    public DataSource dataSource;



    @Autowired
    public EmployeeProcessorDemo1 employeeProcessorDemo1;

    @Autowired
    @Qualifier("employeeprocessordemo3")
    public EmployeeProcessorDemo3 employeeProcessorDemo3;

    @Autowired
    @Qualifier("employeeprocessorapi")
    public CdcResponseProcessorApi employeeprocessorapi;


    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Autowired
    @Qualifier("employeewriter")
    public ItemWriter itemWriter;

    @Autowired
    @Qualifier("cdcdbresponsewriter")
    public CdcResponseDBWriter cdcResponseDbWriter;

    @Autowired
    public ImmunizationInfoRepo immunizationInfoRepo;

    private Resource outputResource = new FileSystemResource("output/employee_output.csv");

    @Value("${name}")
    private String name;


    @Qualifier("demo1")
    @Bean
    public Job demo1Job(JobBuilderFactory jobBuilderFactory){
        return jobBuilderFactory.get("demo1")
                .start(step1Demo1())
                .build();

    }
  /* public JobBuilderFactory jobBuilderFactory;
    public StepBuilderFactory stepBuilderFactory;
    public EmployeeProcessorDemo1 employeeProcessor;
    public DataSource dataSource;

    @Autowired
    public SpringBatchCdc(JobBuilderFactory jobBuilderFactory, StepBuilderFactory stepBuilderFactory, EmployeeProcessorDemo1 employeeProcessor, DataSource dataSource){
        this.jobBuilderFactory = jobBuilderFactory;
        this.stepBuilderFactory = stepBuilderFactory;
        this.employeeProcessor = employeeProcessor;
        this.dataSource = dataSource;
    }*/

   /* @Qualifier("demo3")
    @Bean
    public Job demo3Job(JobBuilderFactory jobBuilderFactory) throws Exception {
        return jobBuilderFactory.get("demo3")
                .start(step1Demo3())
                .build();
    }*/

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public void test(){
        System.out.println("value of name is "+name);
    }

    @Qualifier("dbtoapi")
    @Bean
    public Job dbtoapiJob(JobBuilderFactory jobBuilderFactory) throws Exception {
        return jobBuilderFactory.get("dbtoapi")
                .start(step1DbtoApi())
                .build();
    }



    @Qualifier("demorunBatchJobCsvToDbMultiThread")
    @Bean
    public Job demorunBatchJobCsvToDbMultiThread(JobBuilderFactory jobBuilderFactory) throws Exception {
        return  jobBuilderFactory.get("demorunBatchJobCsvToDbMultiThread")
                .start(step1JobCsvToDbMultiThread())
                .build();
    }
    @Bean
    public Step step1JobCsvToDbMultiThread() {

        return stepBuilderFactory.get("step1")
                .<EmployeeDTO,Employee>chunk(5)
                .reader(EmployeeReader())
                .processor(employeeProcessorDemo1)
                .writer(/*employeeDBWriterDefault()*/ itemWriter)
                .taskExecutor(taskExecutor())
                .build();

    }
    @Bean
    public Step step1Demo1() {

        return stepBuilderFactory.get("step1")
                .<EmployeeDTO,Employee>chunk(5)
                .reader(EmployeeReader())
                .processor(employeeProcessorDemo1)
                .writer(/*employeeDBWriterDefault()*/ itemWriter)
                .build();
        
    }

    @Bean
    public TaskExecutor taskExecutor(){
        SimpleAsyncTaskExecutor simpleAsyncTaskExecutor = new SimpleAsyncTaskExecutor();
        simpleAsyncTaskExecutor.setConcurrencyLimit(5);
        return simpleAsyncTaskExecutor;
    }
   /* @Bean
    public Step step1Demo3() throws Exception {
        return this.stepBuilderFactory.get("step3")
                .<Employee, EmployeeDTO>chunk(10)
                .reader(cdcInfoDBReader())
                .processor(employeeProcessorDemo3)
                .writer(employeeFileWriter())
                .build();
    }*/

   @Autowired
   @Qualifier("immunizationinforeader")
   private ImmunizationInfoDBReader immunizationInfoDBReader;
    @Bean
    public Step step1DbtoApi() throws Exception {
        return this.stepBuilderFactory.get("step3")
                .<CdcRequestToApi, CdcResponseFromApi>chunk(20)
                .reader(immunizationInfoDBReader)
                .processor(employeeprocessorapi)
                .writer(cdcResponseDbWriter)
                .build();
    }
    private Map<String, Sort.Direction> sorts;
   /* @Bean
    public ItemStreamReader<CdcRequestToApi> cdcInfoDBReader() {
        *//*JdbcCursorItemReader<CdcRequestToApi> reader = new JdbcCursorItemReader<>();
        reader.setDataSource(dataSource);
        //select * from  IMMUNIZATION_INFO  immunizationInfo, cdc_resp_info cdcRespInfo where immunizationInfo.vax_event_id=cdcRespInfo.vax_event_id and cdcRespInfo.status='0'
        reader.setSql("select * from  IMMUNIZATION_INFO  immunizationInfo");
        reader.setRowMapper(((resultSet, employee) -> {
           return CdcRequestToApi.builder().vaxEventId(resultSet.getString("vax_event_id"))
                   .extType(resultSet.getString("ext_type"))
                   .pprlId(resultSet.getString("pprl_id"))
                   .recipId(resultSet.getString("recip_id"))
                   .recipFirstName(resultSet.getString("recip_first_name")).build();
        }));
        return reader;*//*
       *//* RepositoryItemReader<CdcRequestToApi> repositoryItemReader = new RepositoryItemReader<>();
        repositoryItemReader.setRepository(immunizationInfoRepo);
        repositoryItemReader.setMethodName("findAll");
        repositoryItemReader.setSort(sorts);*//*
       // repositoryItemReader.afterPropertiesSet();
        return repositoryItemReader;

    }*/

    @Bean
    public ItemWriter<EmployeeDTO> employeeFileWriter() throws Exception {
        FlatFileItemWriter<EmployeeDTO> writer = new FlatFileItemWriter<>();
        writer.setResource(outputResource);
        writer.setLineAggregator(new DelimitedLineAggregator<EmployeeDTO>() {
            {
                setFieldExtractor(new BeanWrapperFieldExtractor<EmployeeDTO>() {
                    {
                        setNames(new String[]{"employeeId", "firstName", "lastName", "email", "age"});
                    }
                });
            }
        });
        writer.setShouldDeleteIfExists(true);
        return writer;
    }
   /* @Bean
    public ItemWriter<CdcResponse> cdcResponseDbWriter() throws Exception {
        FlatFileItemWriter<CdcResponse> writer = new FlatFileItemWriter<>();
        writer.setResource(outputResource);
        writer.setLineAggregator(new DelimitedLineAggregator<CdcResponse>() {
            {
                setFieldExtractor(new BeanWrapperFieldExtractor<CdcResponse>() {
                    {
                        setNames(new String[]{"employeeId", "firstName", "lastName", "email", "age"});
                    }
                });
            }
        });
        writer.setShouldDeleteIfExists(true);
        return writer;
    }*/

    @Bean
    @StepScope
    public FlatFileItemReader<EmployeeDTO> EmployeeReader() {
        FlatFileItemReader<EmployeeDTO> flatFileItemReader = new FlatFileItemReader<>();
        flatFileItemReader.setResource(inputFileResource(null));
        DelimitedLineTokenizer delimitedLineTokenizer = new DelimitedLineTokenizer();
        delimitedLineTokenizer.setDelimiter(",");
        delimitedLineTokenizer.setNames("employeeId", "firstName", "lastName", "email", "age");
        DefaultLineMapper<EmployeeDTO> defaultLineMapper = new DefaultLineMapper<>();
        defaultLineMapper.setLineTokenizer(delimitedLineTokenizer);
        defaultLineMapper.setFieldSetMapper(new EmployeeFileRowMapper());
        flatFileItemReader.setLineMapper(defaultLineMapper);
        return flatFileItemReader;
    }

    @Bean
    @StepScope
    public Resource inputFileResource(@Value("#{jobParameters[fileName]}") final String fileName) {
        return new ClassPathResource(fileName);
    }

    @Bean
    public JdbcBatchItemWriter<Employee> employeeDBWriterDefault() {
        JdbcBatchItemWriter<Employee> itemWriter = new JdbcBatchItemWriter<Employee>();
        itemWriter.setDataSource(dataSource);
        itemWriter.setSql("insert into employee (employee_id, first_name, last_name, email, age) values (:employeeId, :firstName, :lastName, :email, :age)");
        itemWriter.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<Employee>());
        return itemWriter;
    }
}
