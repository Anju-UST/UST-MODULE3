package com.ust.iocautowiring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("beans3.xml"); 
		B b=(B)context.getBean("b");
		System.out.println(b);
		context.registerShutdownHook();
	}

}
