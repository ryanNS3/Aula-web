package com.curso.boot.demo_mvc_2026_02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

@SpringBootApplication(scanBasePackages = "com.curso.boot")
@EntityScan("com.curso.boot.domain")
public class DemoMvc202602Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoMvc202602Application.class, args);
	}

}
