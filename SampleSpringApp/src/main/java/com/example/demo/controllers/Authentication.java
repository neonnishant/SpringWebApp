package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

@RequestMapping("/authenticate")
public class Authentication {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getDevName(@RequestParam String user_id, @RequestParam String password) {
		System.out.println("UserName "+user_id);
		System.out.println("PassWord "+password);
		return password;

	}
}
