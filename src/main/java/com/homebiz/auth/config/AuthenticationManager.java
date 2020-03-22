package com.homebiz.auth.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationManager {
	
	@Autowired
	private OAuthAuthenticationProvider oAuthAuthenticationProvider;
	
	@Autowired
	private JDBCAuthenticationProvider jdbcAuthenticationProvider;
	
	@Autowired
	private UserNamePasswordAuthenticationProvider userNamePasswordAuthenticationProvider;

	public Authentication authenticate(Authentication authentication, String authenticationType) {
		switch(authenticationType) {
		case "OAUTH":
			return oAuthAuthenticationProvider.authenticate(authentication);
		case "JDBC":
			return jdbcAuthenticationProvider.authenticate(authentication);
		default:
			return userNamePasswordAuthenticationProvider.authenticate(authentication);
		}
	}

}
