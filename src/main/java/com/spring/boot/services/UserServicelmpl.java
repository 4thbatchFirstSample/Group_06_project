package com.spring.boot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entities.User;
import com.spring.boot.repositories.UserRepository;

@Service
public class UserServicelmpl implements UserService{
	@Autowired
	private UserRepository userRepo;

	@Override
	public void adduser(User user) {
		userRepo.save(user);
		
	}
	
	

}
