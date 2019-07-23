package com.example.demo.businesslogic;

import com.example.demo.businesslogic.dtos.AuthDto;

public class Authenticator {
	public AuthDto verifyLogin(String userid, String password) {
		return new AuthDto("Success", "Authentication Succed");
	}

	public void registerNewUser(String username, String userId, String password, String emailId) {

	}
}
