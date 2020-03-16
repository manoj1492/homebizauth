package com.homebiz.auth.model;

import java.io.Serializable;

public class AuthRequest implements Serializable {

	private static final long serialVersionUID = 2306325853352591271L;
	private String username;
	private String password;

//need default constructor for JSON Parsing
	public AuthRequest() {
	}

	public AuthRequest(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
