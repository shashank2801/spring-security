package com.shashank.security.easybank.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {
	
	@GetMapping("/getBalance")
	public String getBalance() {
		return "Welcome to the login page";
	}
}
