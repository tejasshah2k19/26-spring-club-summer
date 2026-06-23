package com.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.entity.UserEntity;
import com.repository.UserRepository;


@Controller
public class SessionController {

	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/signup")
	public String signup() {
		return "Signup";// name of the jsp page
	}
	
	@PostMapping("saveUser")
	public String saveUser(UserEntity userEntity) {
		
		//validation 
		userEntity.setRole("USER");
		userEntity.setCreatedAt(LocalDate.now());
		//db insert 
		userRepository.save(userEntity);//insert 
		return "Login";
	
	}
	
}




