package com.info.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeService s = (EmployeeService) ctx.getBean("empservimpl");
		// s.getEmployeebyNameAndId(101, "Ravic");// first
		//s.addEmployee();

		EmployeeServiceImpl es = (EmployeeServiceImpl) s;
		/*
		 * TO use the above line, we must write this line in applicationContext.xml
		 * <aop:aspectj-autoproxy proxy-target-class="true"/>, otherwise you will get
		 * this exception java.lang.ClassCastException: com.sun.proxy.$Proxy14 cannot be
		 * cast to com.info.demo3.EmployeeServiceImpl
		 * 
		 */
		//es.afterReturningDemo();
		//es.afterAroundDemo();
		//es.afterThrowingDemo();

	}

}
