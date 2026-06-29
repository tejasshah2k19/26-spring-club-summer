package com.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.entity.UserEntity;
import com.repository.UserRepository;

@Controller
public class AdminUserController {

	// list users
	// view | delete | edit

	@Autowired
	UserRepository userRepository;

	@GetMapping("/admin/users")
	public String listUsers(Model model) {
		List<UserEntity> users = userRepository.findAll();
		model.addAttribute("users", users);
		return "admin/ListUser";
	}

}
