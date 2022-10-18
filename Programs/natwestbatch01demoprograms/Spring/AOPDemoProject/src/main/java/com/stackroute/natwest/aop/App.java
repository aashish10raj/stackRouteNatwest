package com.stackroute.natwest.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.stackroute.natwest.aop.config.AppConfig;
import com.stackroute.natwest.aop.service.FoodService;
import com.stackroute.natwest.aop.service.MenuService;

public class App 
{
    public static void main( String[] args ){
    	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	MenuService service1=context.getBean("menuService", MenuService.class);
    	service1.breakfastMenuDetails();
    	service1.lunchMenuDetails();
    	FoodService service2=context.getBean("foodService", FoodService.class);
    	service2.breakfastMenuDetails();
    	service2.lunchMenuDetails();
    	
    	
  
    }
}
