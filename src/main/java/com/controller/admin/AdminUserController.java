package com.controller.admin;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

	// delete from users where userId = 1
	@GetMapping("admin/deleteUser/{userId}")
	public String deleteUser(@PathVariable Integer userId) {
		//
		userRepository.deleteById(userId);
		return "redirect:/admin/users";// url
	}

	// select * from users where userId = 1
	@GetMapping("/admin/viewUser/{userId}") // url
	public String viewUser(@PathVariable Integer userId, Model model) {

		Optional<UserEntity> opUser = userRepository.findById(userId); // Optional
		if (opUser.isPresent()) {
			UserEntity user = opUser.get(); // extract
			model.addAttribute("user", user);
			return "admin/ViewUser";// jsp

		} else {
			return "redirect:/admin/users"; // url
		}
	}

	@GetMapping("/admin/editUser/{userId}") // url
	public String editUser(@PathVariable Integer userId, Model model) {

		Optional<UserEntity> opUser = userRepository.findById(userId); // Optional
		if (opUser.isPresent()) {
			UserEntity user = opUser.get(); // extract
			model.addAttribute("user", user);
			return "admin/EditUser";// jsp

		} else {
			return "redirect:/admin/users"; // url
		}
	}

	@PostMapping("/admin/updateUser")
	public String updateUser(UserEntity user) {//firstName lastName 
		//read 
		
		//update users set firstName = user.firstName , lastName = user.lastName 
			//where userId = user.userId
		
		return "redirect:/admin/users";//url 
	}
	
	
	
	
	
	
	
	
	
	
}
