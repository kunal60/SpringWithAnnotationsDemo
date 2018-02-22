package com.info.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hello {

	@Autowired
	HelloWorldService service;

	public void dummyTest() {

		String message = service.sayHello();
		System.out.println(message);

		// set a new name
		service.setName("Spring");
		message = service.sayHello();
		System.out.println(message);
	}
}