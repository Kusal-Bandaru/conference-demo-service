package com.kusal.conferencedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RestController
public class HomeController {
	
	@GetMapping
	public String hello() {
		return "Welcome to the conference app!";
	}

}
