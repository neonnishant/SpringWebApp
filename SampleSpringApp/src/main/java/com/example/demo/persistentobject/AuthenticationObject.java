package com.example.demo.persistentobject;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "authentication_table")
public class AuthenticationObject {
	private String id;
	private String user_id;
	private String password;
	private String createdon;
	private String username;

	public AuthenticationObject(String id, String user_id, String password, String createdon, String username) {
		this.setId(id);
		this.setUser_id(user_id);
		this.setPassword(password);
		this.setCreatedon(createdon);
		this.setUsername(username);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreatedon() {
		return createdon;
	}

	public void setCreatedon(String createdon) {
		this.createdon = createdon;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
