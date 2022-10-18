package com.stackroute.natwest.springProject1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import com.stackroute.natwest.AnnotationProj.AppConfig;

import org.springframework.beans.factory.*;


public class App 
{
    public static void main( String[] args )
    {
//       BeanFactory factory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
//       Actor actor=(Actor) factory.getBean("actor1");
//       System.out.println(actor);
       
       
       ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
       
//       Actor act1= (Actor) context.getBean("actor1");
//       System.out.println(act1);
       
       Movie mov= (Movie) context.getBean("movie1");
       System.out.println(mov);
       
       
       
    }
    
}
