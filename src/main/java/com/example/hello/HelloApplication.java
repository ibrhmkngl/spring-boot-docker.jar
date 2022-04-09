package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloApplication {
	@GetMapping("/message")
	public String Hello(){
		return "Hello World...";
	}
	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

}
