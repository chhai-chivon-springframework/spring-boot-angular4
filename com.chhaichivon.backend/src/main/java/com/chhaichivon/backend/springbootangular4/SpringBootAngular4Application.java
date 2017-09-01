package com.chhaichivon.backend.springbootangular4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.chhaichivon.backend.springbootangular4.models")
@EnableJpaRepositories(basePackages = "com.chhaichivon.backend.springbootangular4.repository")
public class SpringBootAngular4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAngular4Application.class, args);
	}
}
