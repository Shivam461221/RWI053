package com.shivam.servicesImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.shivam.dto.LoginDTO;
import com.shivam.dto.UserDTO;
import com.shivam.models.User;
import com.shivam.repos.UserRepository;
import com.shivam.response.LoginResponse;
import com.shivam.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public String addUser(UserDTO userDTO) {
		User user = new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail(),
				this.passwordEncoder.encode(userDTO.getPassword()));
		userRepository.save(user);
		return user.getName();
	}
	
//	public User getUser(UserDTO userDTO) {
//		User user = new User
//	}

	@Override
	public LoginResponse loginUser(LoginDTO loginDTO) {
		//String msg = "";
		Optional<User> user = userRepository.findByEmail(loginDTO.getEmail());
		if (user != null) {
			String password = loginDTO.getPassword();
			String encodedPassword = user.get().getPassword();
			Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
			if (isPwdRight) {
				Optional<User> user1 = userRepository.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
				if (user1.isPresent()) {
					return new LoginResponse("Login Success", true);
				} else {
					return new LoginResponse("Login Failed", false);
				}
			} else {
				return new LoginResponse("Password not Match", false);
			}
		} else {
			return new LoginResponse("Email not exist", false);
		}

	}

}
