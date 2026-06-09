package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.UserBean;

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
	public String saveUser(UserBean userBean) {
		//form data read 
		System.out.println(userBean.getFirstName());
		System.out.println(userBean.getLastName());
		System.out.println(userBean.getEmail());
		System.out.println(userBean.getPassword());
		//validation 
	
		//db insertion 
		System.out.println("User saved successfully");
		return "Login";
	}
	
}
