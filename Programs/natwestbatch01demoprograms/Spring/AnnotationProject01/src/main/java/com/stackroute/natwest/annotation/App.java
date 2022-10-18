package com.stackroute.natwest.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args ){
    	
    	ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Student s1=context.getBean(Student.class);
    	System.out.println(s1.hashCode());
    	
    	Student s2=context.getBean(Student.class);
    	System.out.println(s2.hashCode());
    	
    	
        
    }
}
