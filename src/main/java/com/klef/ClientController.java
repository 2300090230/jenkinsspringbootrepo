package com.klef;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	
	@GetMapping("/")
	public String home() {
		
		return "Hello this is Home";
	}
	
	@GetMapping("/demo")
	public String demo() {
		
		return "Jenkins";
	}
	
	@GetMapping("/test")
	public String test() {
		
		return "Deploy Spring Boot using Jenkins";
	}
	
	@GetMapping("/laxman")
	public String laxman() {
		
		return "Hello I am Laxman";
	}
	
	
	

}
