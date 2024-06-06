package com.shivam.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.shivam.dto.UserDTO;
import com.shivam.models.User;
import java.util.List;


@Repository
@EnableJpaRepositories
public interface UserRepository  extends JpaRepository<User, Integer>{
	
	Optional<User> findOneByEmailAndPassword(String email, String password);
	
	Optional<User> findByEmail(String email);
}
