package com.example.demo.businesslogic.dtos;

public class AuthDto {
	private String status = "Failed";
	private String message = "";

	public AuthDto(String _status, String _message) {
		this.status = _status;
		this.message = _message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
