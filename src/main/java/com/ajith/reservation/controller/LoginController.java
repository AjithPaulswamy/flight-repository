package com.ajith.reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ajith.reservation.entity.User;
import com.ajith.reservation.repo.UserRepository;

@Controller
public class LoginController {
	
	@Autowired
	UserRepository userRepo;
	
	@RequestMapping("/loginHome")
	public String showLogin() {
		return "/login/login";
	}

	@RequestMapping("/validateLogin")
	public String login(@RequestParam("email") String email, @RequestParam("password") String password, ModelMap modelMap) {
		System.out.println("inside login - "+email);
		User user = userRepo.findByEmail(email);
		if(null!=user && user.getPassword().equals(password)) {
			System.out.println("correct password");
			return "login/findFlights";
		}
		else {
			System.out.println("wrong password");
			modelMap.addAttribute("msg", "Invalid login. Please try again!!!");
			return "login/login";
		}
	}
}