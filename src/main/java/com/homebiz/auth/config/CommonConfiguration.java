package com.homebiz.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
@Order(1)
public class CommonConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {

		httpSecurity.authorizeRequests().antMatchers("/auth/authenticate").permitAll();
		httpSecurity.authorizeRequests().anyRequest().authenticated();
		httpSecurity.cors();
		httpSecurity.csrf().disable();
		httpSecurity.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}
	
	@Bean
	public CorsConfigurationSource corsConfigurationSource() {
		 UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		  CorsConfiguration config = new CorsConfiguration();
		  config.addAllowedOrigin("*");
		  config.setAllowCredentials(true);
		 // config.addAllowedHeader("X-Requested-With");
		  config.addAllowedHeader("*");
		  config.addAllowedMethod(HttpMethod.POST);
		  source.registerCorsConfiguration("/**", config);
		  
		return source;
	}
}
