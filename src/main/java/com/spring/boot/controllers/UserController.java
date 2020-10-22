package com.spring.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.entities.User;
import com.spring.boot.services.UserService;

@RestController
@RequestMapping(value = "api/v1/auth")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/adduser")
	public String addUser(@RequestBody User user) {
		userService.addUser(user);
		return "user added";
		
	}

}
