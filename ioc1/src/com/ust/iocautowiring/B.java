package com.ust.iocautowiring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;

public class B {

	A a;
//default constructor is needed to call autowiring by byName, byType
	public B() {
		// TODO Auto-generated constructor stub
	}
	
	@Qualifier("a")
	public void setA(A a) {//byName  byType will use setter injection
		System.out.println("set A() called....");
		this.a = a;
	}
	public B(A a) {
		// TODO Auto-generated constructor stub
		this.a=a;
		System.out.println("from B() constructor.....");
	}//A is the type,, a is the name
	//autowire by constructor means constructor with parameter--- directly use constructor and inject it
	//for byName to work only 1name to 1 bean for bytype 1 class definition for 1 bean

	@PostConstruct //this annotation treats the following method as init()
	public void SetUp() {
		System.out.println("from setup");
	}
	
	@PreDestroy 
	public void WindUp() {
		System.out.println("from windup...");
		//ioc container calls this methods and are called callback methods
	}
}
