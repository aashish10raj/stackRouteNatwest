package com.project;

import com.project.Customer.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CustomerServiceApplication implements CommandLineRunner {
	@Autowired
	private CustomerService customerService;
	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting code");
//		Customer c=new Customer();
//		c.setCustomerId("1234");
//		c.setName("Divyang");
//		c.setEmail("abc@gmail.com");
//		c.setPassword("1234");
//		c.setMobileno("1234567890");
//		customerService.addCustomer(c);
	}
}
