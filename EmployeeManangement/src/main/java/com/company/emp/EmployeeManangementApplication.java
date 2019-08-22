package com.company.emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.company"})
public class EmployeeManangementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManangementApplication.class, args);
	}

}
