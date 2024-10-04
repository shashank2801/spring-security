package com.shashank.security.easybank.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	
	@GetMapping("/myAccount")
	public String getAccountDetails() {
		return "Welcome to the login page";
	}
}
