package com.shivam.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.shivam.services.UserService;

@Configuration
public class MyConfig {
	
	@Autowired
	private UserService userService;
	
}
