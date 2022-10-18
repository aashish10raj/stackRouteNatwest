package com.stackroute.natwest.mdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.stackroute.natwest.mdb.filter.MobileFilter;

@SpringBootApplication
@EnableEurekaClient
@EnableWebMvc
public class MobileServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileServiceApplication.class, args);	
	}
	
	@Bean
	public FilterRegistrationBean mobileFilter() {
		FilterRegistrationBean filter=new FilterRegistrationBean();
		filter.setFilter(new MobileFilter());
		filter.addUrlPatterns("/*");
		return filter;
	}

}
