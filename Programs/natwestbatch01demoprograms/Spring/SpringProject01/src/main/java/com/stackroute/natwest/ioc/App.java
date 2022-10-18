package com.stackroute.natwest.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App 
{
    public static void main( String[] args )
    {
        // Object Construction | Done by Developer
    	
    	   Employee e1=new Employee();
    	   e1.setEmployeeId(1);
    	   e1.setName("Gaurav");
    	   e1.setSalary(75000.00);
    	   
    	   System.out.println("Employee ID = "+e1.getEmployeeId());
    	   System.out.println("Employee Name = "+e1.getName());
    	   System.out.println("Salary = "+e1.getSalary());
    	   
    	   System.out.println("********************************************************************************************************");
    	   
    	   // Object Construction | In Spring way or IOC
    	   
    	   // BeanFactory Interface
    	   
//    	    BeanFactory factory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
    	    
//    	    Employee e2=(Employee) factory.getBean("emp1");
//    	    System.out.println(e2);
//    	    
//    	    Employee e3=factory.getBean("emp2", Employee.class);
//    	    System.out.println(e3);
    	    
    	    // ApplicationContext Interface
    	    
    	   ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
    	   
    	   Employee e2=(Employee) context.getBean("emp1");
   	       System.out.println(e2);
//   	    
//   	       Employee e3=context.getBean("emp2", Employee.class);
//   	       System.out.println(e3);
    	 
   	      ((AbstractApplicationContext) context).close();
    	    		
    }
}
