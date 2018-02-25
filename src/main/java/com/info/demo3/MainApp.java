package com.info.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		System.out.println("HI");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("HI2");
		EmployeeService s = (EmployeeService) ctx.getBean("empservimpl");
		s.getEmployeebyNameAndId(101, "Ravic");// first
		// s.addEmployee();
	}

}
