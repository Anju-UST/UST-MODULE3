package com.ust.ioc2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;



public class TestDrawing2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("beans.xml"));
		// all beans are auto promoted to object type
//		Object obj1=factory.getBean("point1");
//		System.out.println(obj1);
//		
//		Object obj2=factory.getBean("point2");
//		System.out.println(obj2);
//		
//		Object obj3=factory.getBean("line");
//		Line line=(Line)obj3;
//		line.drawLine();
//	
		
		
		//ClassPathXmlApplicationContext context=
		//ApplicationContext context=new ClassPathXmlApplicationContext("beans2.xml");
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("beans2.xml"); 
		context.registerShutdownHook();//to see destroy method
		boolean exists=context.containsBean("line");
		System.out.println(exists);//true
		if(exists) {
			Object object=context.getBean("line");
			if(object instanceof Line) {
				Line line=(Line)object;
				line.drawLine();//from p1 to p2
			}
		}
		boolean type= context.isSingleton("line");
		System.out.println(type);//true
		//every bean created is singleton
		
//		Object object=context.getBean("line");
//		Object object2=context.getBean("line");
//		if(object.hashCode()==object2.hashCode()) {
//			System.out.println("line is singleton");//singleton
//		}
//		else
//			System.out.println("not");
		
		
		
		Line line1=(Line)context.getBean("line");
		Line line2=(Line)context.getBean("line");
		if(line1.hashCode()==line2.hashCode())
			System.out.println("singleton");
		else
			System.out.println("not");//default singleton if scope is protype every time a bean is requested a new instance is returned
	}

}
