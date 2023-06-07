package com.ust.productClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
//we can do configuration becz of @springboot it enables autocongiguration
@SpringBootApplication
public class ProductClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductClientApplication.class, args);
	}
	@Bean
	public RestTemplate createTemplate() {
		return new RestTemplate();
	}
}
