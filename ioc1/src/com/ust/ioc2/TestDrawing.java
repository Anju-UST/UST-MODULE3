package com.ust.ioc2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;



public class TestDrawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("beans.xml"));
		// all beans are auto promoted to object type
		Object obj1=factory.getBean("point1");
		System.out.println(obj1);
		
		Object obj2=factory.getBean("point2");
		System.out.println(obj2);
		
		Object obj3=factory.getBean("line");
		Line line=(Line)obj3;
		line.drawLine();
		
	}

}
