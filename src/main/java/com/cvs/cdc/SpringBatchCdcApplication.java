package com.cvs.cdc;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@EnableBatchProcessing
//@EntityScan("com.cvs.cdc.model")
@ConfigurationPropertiesScan("com.cvs.cdc.config")
public class SpringBatchCdcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBatchCdcApplication.class, args);
    }

}
