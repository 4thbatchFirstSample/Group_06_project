package com.spring.boot.converters;

import java.util.ArrayList;
import java.util.List;


import com.spring.boot.dto.UserDto;

import com.spring.boot.entities.User;

public class UserConverter {
	// UserDto to User Entity Converter
		public static User userDtoToUser(UserDto userDto) {
			User user = new User();
			if (userDto != null) {
				user.setUserId(userDto.getUserId());
				user.setUserName(userDto.getUserName());
				user.setUserRole(userDto.getUserRole());
				return user;
			}
			return null;
		}

		
		// User Entity  to UserDto Converter
		public static UserDto userToUserDto(User user) {
			UserDto userDto = new UserDto();
			if (user != null) {
				userDto.setUserId(user.getUserId());
				userDto.setUserName(user.getUserName());
				userDto.setUserRole(user.getUserRole());
				return userDto;
			}
			return null;
		}

		
		
		
		// UserDtoList to User Entity List Converter
			public static List<User> userDtoListToUserList(List<UserDto> userDtoList) {
				List<User> listUser = new ArrayList<>();
				
				if (userDtoList != null) {
					for (UserDto userDto : userDtoList) {
						User user = new User();
					
						user.setUserId(userDto.getUserId());
						user.setUserName(userDto.getUserName());
						user.setUserRole(userDto.getUserRole());
					
						listUser.add(user);
				}
					return listUser;
				}
				return null;
			}
		
		
				
		
		// User List to UserDto list converter

		public static List<UserDto> userListToUserDtoList(List<User> userList) {
			List<UserDto> listUserDto = new ArrayList<>();
			if (userList != null) {
				for (User user : userList) {
					UserDto userDto = new UserDto();
					userDto.setUserId(user.getUserId());
					userDto.setUserName(user.getUserName());
					userDto.setUserRole(user.getUserRole());

					listUserDto.add(userDto);
				}
				return listUserDto;
			}
			return null;

		}
}
