package com.au.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//multiple advices inside aspect
@Aspect
public class LoggingAspect {
	
	
	@Before("allGetters()")
	public void SecondAdvice() {
		System.out.println("Second Advice");
		
	}
	
	//to write specifically for circle class write om.au.aop.model.Circle.getName()
//	@Before("execution(public String getName())")
//	public void LoggingAdvice() {
//		System.out.println("Logging Advice");
//	}
	
	//Apply before all methods start with get
	//execution(public * get*(*) - with parameter
	//execution(public * get*(..) - with any number of parameters
	//execution(* com.au.aop.model.*.get*()) - all get functions for class under model
	@Before("execution(public * get*())")
	public void LoggingAdvice() {
		System.out.println("Logging Advice");
		
	}
	
	
	
	
	@Pointcut(value= "execution(* com.au.aop.aspect.*(..))")
    private void logAfter() { }
	
	
	@AfterReturning(value= "logAfter()", returning= "status")
    public void afterReturningAdvice(JoinPoint jp, Object status){
        System.out.println("Inside afterReturningAdvice() method....");
        System.out.println("Success " + status);
    }
	
	@After("allGetters()")
	public void AfterAdvice() {
		System.out.println("After Method used");
		
	}
	
	
	 @AfterThrowing(value = "execution(* com.au.aop.aspect.*(..))", 
		      throwing = "error")
	 public void afterThrowingAdvice( Throwable error){
     System.out.println("Method afterthrowing" );  
	 System.out.println("Exception: "+error);  
	 }
	
	

	
	
	//Define pointcut expression
	@Pointcut("execution(public * get*(..))")
	public void allGetters() { 
		/* this is a dummy method for holding pointcut expressions, so they can be referenced later in annotations @Before etc */
	}

}
