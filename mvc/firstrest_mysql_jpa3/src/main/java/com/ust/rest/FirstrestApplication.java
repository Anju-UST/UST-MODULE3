package com.ust.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ust.rest.repository.ProductRepository;
import com.ust.rest.resource.Product;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class FirstrestApplication implements CommandLineRunner {
	
	@Autowired
	ProductRepository repo;

	public static void main(String[] args) {
		//SpringApplication.run(FirstrestApplication.class, args);
		ConfigurableApplicationContext ctxt= SpringApplication.run(FirstrestApplication.class, args);
		for(String str:args) {
			System.out.println(str);
		}
		boolean found=ctxt.containsBean("productRepository");
		System.out.println(found);
		                                        //when repo it is false
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("from commandlinerunner");
		List<Product> products=repo.findAll();
		System.out.println(products.size());
		System.out.println(products.get(5));//com.ust.rest.resource.Product@760d429f
		
	}
}
//configuration information in spring autoconfigure jar in meta-INF- spring.factories 
//allow application to run startup code in console
	//context have all the beans
	//whereever autowired beans get injected

//for swagger
//web starters are for restservices dispatcher servelet started--access process incomimg request