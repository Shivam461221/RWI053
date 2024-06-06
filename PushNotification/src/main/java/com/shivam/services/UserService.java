package com.shivam.services;

import com.shivam.dto.LoginDTO;
import com.shivam.dto.UserDTO;
import com.shivam.response.LoginResponse;

public interface UserService {
	
	public String addUser(UserDTO userDTO);
	
	public LoginResponse loginUser(LoginDTO loginDTO);
}
