package com.ust.restactuarors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstrestActuatorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstrestActuatorsApplication.class, args);
	}

}
//localhost:8080/actuator/beans== beans 
//localhost:8080/actuator/health== status up
//						/info=={}
//in app  properties for *===http://localhost:8080/actuator--will give all actuator