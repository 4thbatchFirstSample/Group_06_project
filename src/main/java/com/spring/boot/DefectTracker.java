package com.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages={"com.spring.boot.controllers","com.spring.boot.services","com.spring.boot.repositories","com.spring.boot.config","com.spring.boot.converters","com.spring.boot.counter","com.spring.boot.dto","com.spring.boot.entities"})
//@ComponentScan(basePackages = "com.spring.boot.controllers")
public class DefectTracker {

	public static void main(String[] args) {
		SpringApplication.run(DefectTracker.class, args);
	}

}
