package com.example.Employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
//@ComponentScan({"com.example.Employee.service"})
public class EmployeeApplication {

	public static void main(String[] args) throws Exception{
		SpringApplication.run(EmployeeApplication.class, args);
	}

}
