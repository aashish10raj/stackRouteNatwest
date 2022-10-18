package com.natwest.learning.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*This class AppConfig extends AbstractAnnotationConfigDispatcherServletInitializer
 * class in Servlet 3.0+ environments in order to configure the ServletContext 
 * programmatically -- as opposed to the traditional web.xml-based approach. By overriding the methods of
 * class, we can define the Configuration classes and root mapping so that our application can gets
 * into spring.
 */
public class AppConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {WebMvcConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

}
