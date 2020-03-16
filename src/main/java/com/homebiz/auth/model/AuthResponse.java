package com.homebiz.auth.model;

import java.io.Serializable;

public class AuthResponse implements Serializable {

	private static final long serialVersionUID = 2157643672246741983L;
	private final String jwttoken;

	public AuthResponse(String jwttoken) {
		this.jwttoken = jwttoken;
	}

	public String getToken() {
		return this.jwttoken;
	}
}
