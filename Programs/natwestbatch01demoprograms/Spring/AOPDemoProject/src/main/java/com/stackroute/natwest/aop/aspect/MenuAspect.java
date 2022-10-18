package com.stackroute.natwest.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MenuAspect {
	
	
	private static final Logger logger=LoggerFactory.getLogger(MenuAspect.class);
	
	// Advice -----> What --------> Before,After
	// JoinPoint ------> Where
	
//	@Before("execution(public void breakfastMenuDetails())")
//	public void beforeTarget() {
//		System.out.println("Adviced getting call before target");
//	}@Before("execution(public void breakfastMenuDetails())")
	
//	@After("execution(public void breakfastMenuDetails())")
//	public void beforeTarget() {
//	System.out.println("Adviced getting call after target");
//	}
	
//	@Before("within(com.stackroute.natwest.aop.service.MenuService)")
//	public void beforeTarget() {
//		System.out.println("Adviced getting call before target");
//		}
	
//	@AfterReturning("within(com.stackroute.natwest.aop.service.MenuService)")
//	public void beforeTarget() {
//		System.out.println("Adviced getting call before target");
//		}
	
//	@AfterThrowing("within(com.stackroute.natwest.aop.service.MenuService)")
//	public void beforeTarget() {
//		System.out.println("Adviced getting call before target");
//		}
//	
//	@Around("within(com.stackroute.natwest.aop.service.MenuService)")
//	public void aroundTarget(ProceedingJoinPoint joinPoint) throws Throwable {
//		System.out.println("Adviced getting call before target");
//		joinPoint.proceed();
//		System.out.println("Adviced getting call after target");
//		}
	
	
	@Pointcut("within(com.stackroute.natwest.aop.service.MenuService)")
	public void pointcut() {}
	
	@Before("pointcut()")
	public void beforeTarget() {
		System.out.println("Adviced getting call before target");
		logger.info("MenuAspect::beforeTarget");
		}
	
	@Pointcut("execution(* com.stackroute.natwest.aop.service.*.breakfastMenuDetails())")
	public void pointcutWithWildCard() {}
	
	@Around("pointcutWithWildCard()")
	public void aroundTarget(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("Adviced getting call before target");
		logger.debug("MenuAspect::aroundTarget, Before Proceed");
		joinPoint.proceed();
		logger.debug("MenuAspect::aroundTarget, After Proceed");
		System.out.println("Adviced getting call after target");
		}
}
