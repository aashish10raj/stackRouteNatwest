package com.learning.natwest.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



/*This class will contain bean for viewresolver
 * Define the following annotations:
 * @Configuration - Annotating a class with the @Configuration indicates that the 
 *                  class can be used by the Spring IoC container as a source of 
 *                  bean definitions
 * @ComponentScan - this annotation is used to search for the Spring components amongst the application
 * @EnableWebMvc - Adding this annotation to an @Configuration class imports the Spring MVC 
 * 				   configuration from WebMvcConfigurationSupport 
 * */

/*
 * @EnableTransactionManagement - Enables Spring's annotation-driven transaction management capability.
 *                  
 * */

@Configuration
@ComponentScan(basePackages = "com.learning.natwest")
@EnableWebMvc
@EnableTransactionManagement
public class HibernateConfig implements WebMvcConfigurer {

	/*
	 * Define the bean for DataSource. In our application, we are using MySQL as the
	 * dataSource. To create the DataSource bean, we need to know: 1. Driver class
	 * name 2. Database URL 3. UserName 4. Password
	 */
    @Bean
	public DataSource getDataSource() {
	 DriverManagerDataSource dataSource=new DriverManagerDataSource();
	 dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	 dataSource.setUrl("jdbc:mysql://localhost:3306/rbsDB");
	 dataSource.setUsername("root");
	 dataSource.setPassword("password123");
	
	 return dataSource;
	}
    
    /*
	 * Define the bean for SessionFactory. Hibernate SessionFactory is the factory
	 * class through which we get sessions and perform database operations.
	 */
    @Bean
    @Autowired
    public LocalSessionFactoryBean getSessionFactory(DataSource dataSource) {
    	LocalSessionFactoryBean sessionFactory= new LocalSessionFactoryBean();
    	sessionFactory.setDataSource(dataSource);
    	sessionFactory.setPackagesToScan("com.learning.natwest.model");
    	Properties properties=new Properties();
    	properties.put("hibernate.show_sql", true);
    	properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
    	properties.put("hibernate.hbm2ddl.auto", "update");
    	sessionFactory.setHibernateProperties(properties);
    	
    	return sessionFactory;
    }
    
    /*
	 * Define the bean for Transaction Manager. HibernateTransactionManager handles
	 * transaction in Spring. The application that uses single hibernate session
	 * factory for database transaction has good choice to use
	 * HibernateTransactionManager. HibernateTransactionManager can work with plain
	 * JDBC too. HibernateTransactionManager allows bulk update and bulk insert and
	 * ensures data integrity.
	 */
    @Bean
    @Autowired
    public HibernateTransactionManager getTxManager(SessionFactory sessionFactory) {
    	
    	HibernateTransactionManager transactionManager=new HibernateTransactionManager();
    	transactionManager.setSessionFactory(sessionFactory);
    	
    	return transactionManager;
    	
    }

	
}

