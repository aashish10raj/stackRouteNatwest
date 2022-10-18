package com.project;

import com.project.loans.filter.loanfilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class LoanServiceApplication implements CommandLineRunner {
	@Autowired
	public static void main(String[] args) {
		SpringApplication.run(LoanServiceApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean BankLoanFilter() {
		FilterRegistrationBean filter=new FilterRegistrationBean();
		filter.setFilter(new loanfilter());
		filter.addUrlPatterns("/*");
		return filter;
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
