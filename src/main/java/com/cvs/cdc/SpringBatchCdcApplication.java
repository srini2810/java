package com.cvs.cdc;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableBatchProcessing
//@EntityScan("com.cvs.cdc.model")
public class SpringBatchCdcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBatchCdcApplication.class, args);
    }

}
