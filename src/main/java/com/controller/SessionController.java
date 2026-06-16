package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.UserBean;

@Controller
public class SessionController {

	// method - to open jsp
	@GetMapping("/signup")
	public String signup() {
		return "Signup";// name of the jsp page
	}

	@GetMapping(value = { "/login", "/" })
	public String login() {
		return "Login";
	}

	// saveUser -> form -> post

	@PostMapping("/saveUser")
	public String saveUser(UserBean userBean,Model model) {
		// form data read
		System.out.println(userBean.getFirstName());
		System.out.println(userBean.getLastName());
		System.out.println(userBean.getEmail());
		System.out.println(userBean.getPassword());
		// validation
		// 1) required
		boolean isError = false;

		String alphaRegEx = "[a-zA-Z]+";//min:1 max:n
		String digitRegEx = "[0-9]+";
		String emailRegEx = "[a-zA-Z0-9._]+@[a-zA-Z]+\\.[a-zA-Z]+";
		
		if (userBean.getFirstName() == null || userBean.getFirstName().isEmpty()) {
			model.addAttribute("firstNameError", "First name is required");
			isError = true;
		}else if(userBean.getFirstName().length()<=1 || userBean.getFirstName().length()>30 ) {
			model.addAttribute("firstNameError", "First name must be between 2 and 30 characters");
			isError = true;
		}
		else if( userBean.getFirstName().matches(alphaRegEx) == false) {
			isError = true;
			model.addAttribute("firstNameError", "First name should contain only alphabets");
		}
		
		
		
		
		if (userBean.getLastName() == null || userBean.getLastName().isEmpty()) {
			model.addAttribute("lastNameError", "Last name is required");
			isError = true;
		}
		if (userBean.getEmail() == null || userBean.getEmail().isEmpty()) {
			model.addAttribute("emailError", "Email is required");
			isError = true;
		}
		if (userBean.getPassword() == null || userBean.getPassword().isEmpty()) {
			model.addAttribute("passwordError", "Password is required");
			isError = true;
		}//8 A a @  //  
 
		// 2) format , regex
		// 3) password strength
		// 4) unique email db 

		if (isError) {
			return "Signup";
		} else {
			// db insertion
			System.out.println("User saved successfully");
			return "Login";
		}
	}

}
