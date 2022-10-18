package com.natwest.firstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstappApplication {

	public static void main(String[] args) {

		SpringApplication.run(FirstappApplication.class, args);
		System.out.println("Welcome to Spring Boot App");
	}

}
