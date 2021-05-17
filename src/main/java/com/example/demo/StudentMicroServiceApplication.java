package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class StudentMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentMicroServiceApplication.class, args);
	}

	@RequestMapping(value="/student/{name}")
	public String getName(@PathVariable(name="name") String name) {
		return "Hello " +name;
	}
}
