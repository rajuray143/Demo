package com.raju.demoCICD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/main")
public class DemoCicdApplication {

	@GetMapping("/hello")
	public String hello(){
		return " Hello CICD !";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoCicdApplication.class, args);
	}

}
