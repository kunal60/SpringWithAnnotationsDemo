package com.info.demo3;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EmployeeAspect {
	// declare method based pointcut
@Pointcut ("execution(* com.info.demo3.EmployeeService.addEmployee(..))")
public void addEmpPointcut(){}
		
		//call1
@Before("execution(* com.info.demo3.EmployeeService.getEmployeebyNameAndId(..))")
		// Secondary concern
		public void myBeforeAdvice(JoinPoint jpoint) //Advice Method
		{
	System.out.println("Inside Befor Advice Method...");
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
		
}
