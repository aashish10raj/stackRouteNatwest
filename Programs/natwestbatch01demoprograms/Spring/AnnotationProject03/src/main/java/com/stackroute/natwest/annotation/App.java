package com.stackroute.natwest.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args ){
    	
//    	Samsung s23 = new Samsung();
//    	s23.features();
    	
    	ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Samsung s23 = context.getBean(Samsung.class);
    	s23.features();
    	
    	
    	
    	
    	
        
    }
}
