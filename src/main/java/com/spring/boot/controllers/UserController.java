package com.spring.boot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.converters.UserConverter;

import com.spring.boot.dto.UserDto;

import com.spring.boot.services.UserService;



@RestController
@RequestMapping(value ="api/v2")
public class UserController {
	@Autowired
	private UserService userService;
	
	
	//Add User
	@PostMapping(value = "/user")
	public ResponseEntity<Object> addProject(@RequestBody UserDto userDto) {
		userService.addUser(UserConverter.userDtoToUser(userDto));
		return new ResponseEntity<Object>("Added Successfully", HttpStatus.CREATED);
	}
	
	

	//Get All Users
	@GetMapping(value="/AllUsers")
	public List<UserDto>findAllUsers() {
		return UserConverter.userListToUserDtoList(userService.getUsers());
	}
	
	
	
	//Add Users
	@PostMapping(value = "/addUsers")
	public ResponseEntity<Object> addUsers(@RequestBody List<UserDto> userDtoList) {
		userService.saveUsers(UserConverter.userDtoListToUserList(userDtoList));
		return new ResponseEntity<Object>("Added Successfully", HttpStatus.CREATED);
	}

	

	//Get User by Id
	@GetMapping("/userById/{id}")
	public UserDto findUserById(@PathVariable long id) {
		return UserConverter.userToUserDto(userService.getUserById(id));
//		return new ResponseEntity<Object>("Retrieved Successfully", HttpStatus.CREATED);
	}
	
	
	
	//Update User
	@PutMapping(value ="/updates")
	public ResponseEntity<Object>   updateUser(@RequestBody UserDto userDto) {
		userService.updateUser(UserConverter.userDtoToUser(userDto));
		return new ResponseEntity<Object>("Updated",HttpStatus.OK);
	}



	
	//delete User
	@DeleteMapping(value ="/user/delete/{id}")
	public String deleteUser(@PathVariable long id) {
		if(userService.existsById(id)) {
			userService.deleteUser(id);
			return "User Deleted";
		}
		return "ID not exists!!!";
		
	}
	
	
	
	//delete All Users
		@DeleteMapping(value ="/user/deleteAll")
		public String deleteProjects() {
			if(userService.getUsers() != null) {
				userService.deleteAllUsers();
				return "Users Deleted";
			}
			else {
			return "User not exists!!!";
			
		}}
}
