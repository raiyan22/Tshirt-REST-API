package com.springgrest.springgrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
// help : https://stackoverflow.com/questions/42907553/field-required-a-bean-of-type-that-could-not-be-found-error-spring-restful-ap


@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
public class SpringgrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringgrestApplication.class, args);
	}

}
