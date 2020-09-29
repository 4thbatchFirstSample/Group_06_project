package com.spring.boot.services;

import java.util.List;

import com.spring.boot.entities.User;

public interface UserService {
	public void addUser(User user);
	public List<User> getUsers() ;
	public void saveUsers(List<User> users);
	public User getUserById(long id) ;
	public boolean existsById(Long id);
	public void updateUser(User user);
	public void deleteUser(Long id);
	public void deleteAllUsers();
}
