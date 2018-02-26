package com.info.demo3;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
//@Aspect declares the class as aspect.
public class EmployeeAspect {
	// declare method based pointcut
@Pointcut ("execution(* com.info.demo3.EmployeeService.addEmployee(..))")
//@Pointcut declares the pointcut expression.
public void addEmpPointcut(){}
		
		//call1

/*
 * 
 * Annotation Type: Before
 * 
 * Required Element Summary
 * 
 * java.lang.String	value 
          The pointcut expression where to bind the advice
 * 
 */

@Before("execution(* com.info.demo3.EmployeeService.getEmployeebyNameAndId(..))")
		// Secondary concern
		public void myBeforeAdvice(JoinPoint jpoint) //Advice Method
		{
	System.out.println("Inside Before Advice Method...");
	System.out.println("Write your secondry bussiness logic before execution of JoinPoint");
 System.out.println("Entering inside Method "+jpoint.getSignature().getName());	
 System.out.println("Method "+Arrays.toString(jpoint.getArgs()));
 System.out.println("Target class "+jpoint.getTarget().getClass().getName());
		}
	

       //call2
		@After("addEmpPointcut()")
		
		public void afterAdvice()// Advice Method
		{
			System.out.println("Inside After Advice...");
			System.out.println("Write your secondry bussiness logic after execution of JoinPoint");
		}
		
		
		
		@AfterReturning("execution(* com.info.demo3.EmployeeServiceImpl.afterReturningDemo(..))")
				public String afterReturnAdvice()// Advice Method
				{
					System.out.println("Inside AfterReturning Advice...");
					System.out.println("Write your secondry bussiness logic after execution of JoinPoint");
					return null;
				}
		
		
		@Around("execution(* com.info.demo3.EmployeeServiceImpl.afterAroundDemo(..))")
		public void aroundAdvice(ProceedingJoinPoint pjp) throws Throwable// Advice Method
		{
			System.out.println("Additional Concern Before calling actual method");  
	        Object obj=pjp.proceed();  
	        System.out.println("Additional Concern After calling actual method");
			
		}
		
		
		@AfterThrowing(pointcut="execution(* com.info.demo3.EmployeeServiceImpl.afterThrowingDemo(..))",throwing="error")
		public void afterThrowingAdvice(JoinPoint jp,Throwable error) // Advice Method
		{
			 System.out.println("additional concern");  
		        System.out.println("Method Signature: "  + jp.getSignature());  
		        System.out.println("Exception is: "+error);  
		        System.out.println("end of after throwing advice...");  
			
		}
		
}
