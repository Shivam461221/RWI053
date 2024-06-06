package com.shivam.servicesImpl;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.shivam.models.User;
import com.shivam.repos.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{
	
	private UserRepository userRepository;
	
	private static final Logger logger = LoggerFactory.getLogger(CustomUserDetailsService.class);
	public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = userRepository.findByEmail(email)
				.orElseThrow(() -> {
                    logger.error("User not found with email: {}", email);
                    return new UsernameNotFoundException("User not found with email: " + email);
                });

        logger.info("User found: {}", user.getEmail());
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), new ArrayList<>());
    }
	
}
