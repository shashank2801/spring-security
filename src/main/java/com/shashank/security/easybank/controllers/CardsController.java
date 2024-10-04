package com.shashank.security.easybank.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {
	
	@GetMapping("/myCards")
	public String getCardDetails() {
		return "Welcome to the login page";
	}
}
