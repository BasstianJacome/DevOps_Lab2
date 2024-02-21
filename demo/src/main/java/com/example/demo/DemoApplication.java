package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public String hello(){
<<<<<<< HEAD
		return "Good afternoon, Vinicio,Welcome to COMP367";
=======

		return "Good morning, Vinicio,Welcome to COMP367";

>>>>>>> b49e27b5955f75fafef033cbbd3afbb25ac18cac
	}

}
