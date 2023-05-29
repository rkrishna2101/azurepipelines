package com.cyient.dockerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/test-docker")
	public String getData() {
		return "This is a test docker application";
	}
	
}
