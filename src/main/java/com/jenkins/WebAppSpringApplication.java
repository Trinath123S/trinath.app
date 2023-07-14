package com.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class WebAppSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebAppSpringApplication.class, args);
	}
	
	@GetMapping("/")
	public String Hello() {
		return "Hello world this application is a Maven app running on localhost 9000";
		
	}

}
