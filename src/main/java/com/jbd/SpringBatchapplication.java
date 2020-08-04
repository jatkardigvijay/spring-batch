package com.jbd;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class SpringBatchapplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchapplication.class, args);
	}
}
