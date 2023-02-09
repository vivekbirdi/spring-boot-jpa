package com.learning.springboot.learnjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.learning.controller, com.learning.dao, com.learning.springboot.learnjpa")
public class LearnJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnJpaApplication.class, args);
	}

}
