package com.info.demo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Hi company = context.getBean(Hi.class);
		company.dummyTest();
		context.close();
	}
}
