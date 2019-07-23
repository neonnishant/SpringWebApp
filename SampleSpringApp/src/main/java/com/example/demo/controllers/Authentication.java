package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.businesslogic.Authenticator;
import com.example.demo.businesslogic.dtos.AuthDto;

@Controller

@RequestMapping("/authenticate")
public class Authentication {

	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public AuthDto login(@RequestParam String user_id, @RequestParam String password) {
		return new Authenticator().verifyLogin(user_id, password);
	}
}
