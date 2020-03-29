package com.homebiz.auth.model;

import java.io.Serializable;
import java.util.Date;

public class AuthResponse implements Serializable {

	private static final long serialVersionUID = 2157643672246741983L;
	private final String jwttoken;
	private final String username;
	private final Date expiresIn;

	public AuthResponse(String jwttoken, String username, Date expiresIn) {
		this.jwttoken = jwttoken;
		this.username = username;
		this.expiresIn = expiresIn;
	}

	public String getToken() {
		return this.jwttoken;
	}

	public String getUsername() {
		return username;
	}

	public Date getExpiresIn() {
		return expiresIn;
	}
}
