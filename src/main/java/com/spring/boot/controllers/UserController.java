package com.spring.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.entities.User;
import com.spring.boot.services.UserService;


@RestController
@RequestMapping(value = "/auth")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@PreAuthorize("hasAnyRole('user')")
	@PostMapping(value = "/adduser")
	public String addUser(@RequestBody User user) {
		String pwd = user.getPassWord();
		String encryptpwd= passwordEncoder.encode(pwd);
		user.setPassWord(encryptpwd);
		
		userService.addUser(user);
		return "user added";
		
	}

}
