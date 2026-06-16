package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.StudentBean;

@Controller
public class StudentController {

	
	//open jsp 
	@GetMapping("studentRegistration")
	public String studentRegistration() {
		return "StudentRegistration";
	}
	
	
	@PostMapping("registerStudent")
	public String registerStudent(@Validated  StudentBean studentBean,BindingResult result,Model model) {
		//read : bean 
		//validation : required 
		System.out.println(studentBean.getRollNum());
		if(result.hasErrors()) {
			model.addAttribute("result", result);
			return "StudentRegistration";//go back to jsp 
		}
		
		return "Login";
	}
}
