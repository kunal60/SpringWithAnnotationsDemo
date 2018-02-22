package com.info.demo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.info.demo2")
public class AppConfig {
	
	//Must use the bean annotation
	@Bean
	public HiService hiService() {
		return new GoodMorningService();
	}
	
	
	@Bean
	public Hi hi() {
		return new Hi();
	}
	
	
	
}