package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SessionController {

	
	//method - to open jsp 
	@GetMapping("/signup")
	public String signup() {
		return "Signup";// name of the jsp page
	}
	
	@GetMapping(value = {"/login","/"})
	public String login() {
		return "Login";
	}
	
	//saveUser -> form -> post 
	
	@PostMapping("/saveUser")
	public String saveUser(String firstName,String lastName,String email,String password) {
		//form data read 
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(email);
		System.out.println(password);
		//validation 
		//db insertion 
		System.out.println("User saved successfully");
		return "Login";
	}
	
}
