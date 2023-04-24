package com.ust.rest;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
//url for accessing swagger endpoints--http:localhost:portNo/swagger-ui
//class will be java configuration type

@Configuration    // want springboot to create a bean and inject to our application
//there will be method with @bean
@EnableSwagger2
public class Swaggerconfig {
	@Bean
	public Docket docket() {
		return new Docket(DocumentationType.SWAGGER_2).
		select().
		apis(RequestHandlerSelectors.basePackage("com.ust.rest")).
		paths(PathSelectors.any()).
		build().apiInfo(metaData());
	}
				
	private ApiInfo metaData()
	{
		return new ApiInfoBuilder().title("UST-Springboot Swagger Config").
				description("\" Swagger configiration for application\"").
				version("1.1.0").
				license("Apache 2.0").
				licenseUrl("https://www/apache.org/licenses/LICENSE-2.0\"").
				contact(new Contact ("UST","https://youtube.com/","contact@ust.com")).build();
	}
	

}

