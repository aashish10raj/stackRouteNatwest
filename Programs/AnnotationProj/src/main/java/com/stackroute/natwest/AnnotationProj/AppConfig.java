package com.stackroute.natwest.AnnotationProj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	
	@Bean
	@Scope(value="prototype")
	public Student createStudent() {
		return new Student();
	}

}
