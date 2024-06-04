package com.shivam.jwt.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.shivam.jwt.models.User;

@Service
public class UserService {
	
	private List<User> store = new ArrayList<>();
	
	public UserService() {
		store.add(new User(UUID.randomUUID().toString(), "Shivam", "shivam@123"));
		store.add(new User(UUID.randomUUID().toString(), "Kuldeep", "kuldeep@123"));
		store.add(new User(UUID.randomUUID().toString(), "Madhu", "madhu@123"));
		
	}
	
	public List<User> getUsers(){
		return this.store;
	}
}
