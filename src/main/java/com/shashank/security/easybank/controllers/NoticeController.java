package com.shashank.security.easybank.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticeController {
	
	@GetMapping("/notices")
	public String getNotices() {
		return "Welcome to the login page";
	}
}
