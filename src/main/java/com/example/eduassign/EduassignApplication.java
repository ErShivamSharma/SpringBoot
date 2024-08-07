package com.example.eduassign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@EnableJpaRepositories(basePackages = "com.example.eduassign.repository")
@EntityScan(basePackages = "com.example.eduassign.entity")
public class EduassignApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EduassignApplication.class, args);
	}

}
