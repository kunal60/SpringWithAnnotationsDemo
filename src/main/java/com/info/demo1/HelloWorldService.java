package com.info.demo1;

import org.springframework.stereotype.Component;

@Component("helloWorldService")
public class HelloWorldService {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String sayHello() {
		return "Hello! " + name;
	}
}