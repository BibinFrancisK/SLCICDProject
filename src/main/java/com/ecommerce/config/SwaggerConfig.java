package com.ecommerce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket apiDoc() {
		return new Docket(DocumentationType.SWAGGER_2).select()
		.apis(RequestHandlerSelectors.basePackage("com.ecommerce.controller"))
		.build().apiInfo(metaData());
	}

	private ApiInfo metaData() {
		return new ApiInfo("Ecommerce Products RESTful API ", 
				"Ecommerce Products REST API for Online Store", "1.0.0",
				"Term of service as per user guide lines.", 
				new Contact("Bibin Francis", "https://github.com/BibinFrancisK", "email@gmail.com"),
				"Running on Apache Tomcat", "Created as part of Simplilearn project");
	}
}
