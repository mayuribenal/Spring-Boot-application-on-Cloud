package com.javapract.springbootpract;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	
	
	@GetMapping("/")
	public String WelcomeMsg() {
		
		return"welcome to aws console";
	}

}
