package com.ajith.reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ajith.reservation.entity.User;
import com.ajith.reservation.repo.UserRepository;

@Controller
public class UserRegistrationController {
	
	@Autowired
	UserRepository userRepo;
	
	@RequestMapping("/user")
	public String showCreateUser() {
		return "login/userRegistration";
	}
	
	@RequestMapping("/createUser")
	public String createUser(@ModelAttribute User user, ModelMap modelMap) {
		User savedUser = userRepo.save(user);
		String message=savedUser.getEmail() + " - User Created !!!";
		modelMap.addAttribute("msg",message);
		return "login/login";
	}
}
