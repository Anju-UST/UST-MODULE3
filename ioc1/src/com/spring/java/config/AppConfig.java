package com.spring.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	//configuration means class/method will return beans  
	@Bean(name="helloBean")
	public HelloWorld getBean() {
		return new HelloWorldImpl();
	}

}
