package com.client.payments.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontroller {

	@GetMapping("/controller")
	public String Test() {
		return "welcome to spring boot application";
	}
	 
	public String  ssss() {
		return "hfjh";
	}
	
	public String Test1() {
		return "hi";
	}
	
}
