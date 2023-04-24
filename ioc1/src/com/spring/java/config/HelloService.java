package com.spring.java.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloService {

	@Autowired //injection through autowiring for that class should be stereotype
	HelloWorldImpl hello;
	
	void callHello() {
		hello.message();
	}
}
