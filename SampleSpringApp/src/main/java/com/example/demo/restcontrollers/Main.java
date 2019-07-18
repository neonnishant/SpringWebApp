package com.example.demo.restcontrollers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Main")
public class Main {
	
	@RequestMapping("/getName")
	public String getName() {
		return "Hello Neon";
	}
}
