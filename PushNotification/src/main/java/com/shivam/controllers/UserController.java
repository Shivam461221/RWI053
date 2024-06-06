package com.shivam.controllers;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shivam.component.JwtHelper;
import com.shivam.dto.LoginDTO;
import com.shivam.dto.UserDTO;
import com.shivam.models.JwtResponse;
import com.shivam.models.User;
import com.shivam.repos.UserRepository;
import com.shivam.response.LoginResponse;
import com.shivam.services.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepository userRepo;
	
//	@Autowired
//	private AuthenticationManager manager;
	
	@Autowired
	private JwtHelper helper;

	private Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@PostMapping("/add")
	public String saveEmployee(@RequestBody UserDTO userDTO) {
		String id = userService.addUser(userDTO);
		return id;
	}
	
	@PostMapping("/login")
    public ResponseEntity<JwtResponse> loginUser(@RequestBody LoginDTO loginDTO)
    {
        LoginResponse loginResponse = userService.loginUser(loginDTO);
        Optional<User> userDetails = userRepo.findByEmail(loginDTO.getEmail());
        String token = this.helper.generateToken(userDetails.get());
        JwtResponse response = JwtResponse.builder().token(token).username(userDetails.get().getName()).build();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
	
	@ExceptionHandler(BadCredentialsException.class)
	public String exceptionHandler() {
		return "Credentials Invalid !!";
	}
}
