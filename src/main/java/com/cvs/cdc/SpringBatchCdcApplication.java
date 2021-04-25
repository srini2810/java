package com.cvs.cdc;

import com.cvs.cdc.repo.CdcRespRepo;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication/*(exclude={DataSourceAutoConfiguration.class})*/
@EnableBatchProcessing
//@EntityScan("com.cvs.cdc.model")
@ConfigurationPropertiesScan("com.cvs.cdc.config")
@EnableTransactionManagement
public class SpringBatchCdcApplication implements CommandLineRunner {

    @Autowired
    private CdcRespRepo cdcRespRepo;

    public static void main(String[] args) {
        SpringApplication.run(SpringBatchCdcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       // cdcRespRepo.save();
    }
}
