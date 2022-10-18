package com.stackroute.natwest.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@Configuration
@EnableWebMvc
public class TestingDifferentLayersOfRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestingDifferentLayersOfRestServiceApplication.class, args);
	}

}
