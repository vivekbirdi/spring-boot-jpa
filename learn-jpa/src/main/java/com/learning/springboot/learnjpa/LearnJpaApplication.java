package com.learning.springboot.learnjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.learning.controller, com.learning.dao, com.learning.springboot.learnjpa")
@EntityScan("com.learning.entity")
@EnableJpaRepositories ("com.learning.repo")
public class LearnJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnJpaApplication.class, args);
	}

}
