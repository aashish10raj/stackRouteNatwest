package com.stackroute.natwest.cbi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("customerBeans.xml");
       
       Customer customer1=(Customer) context.getBean("customer");
       System.out.println(customer1);
    }
}
