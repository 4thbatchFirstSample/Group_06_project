package com.spring.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entities.User;
import com.spring.boot.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public void addUser(User user) {
		userRepository.save(user);

	}
	
	public List<User> getUsers() {
	        return userRepository.findAll();
	    }

	public void saveUsers(List<User> users) {
		 userRepository.saveAll(users);
	    }
	 
	public User getUserById(long id) {
	        return userRepository.findById(id).orElse(null);
	    }
	  
	  
	  
	  @Override
	  public void updateUser(User user) {
			// TODO Auto-generated method stub
			
		  User existUser = userRepository.findById(user.getUserId()).orElse(null);
		
		  existUser.setUserName(user.getUserName());
		  existUser.setUserRole(user.getUserRole());
		
		  userRepository.save(existUser);
		}
	  
	  
	  @Override
		public void deleteUser(Long id) {
		  userRepository.deleteById(id);
			
		}

		@Override
		public boolean existsById(Long id) {
			// TODO Auto-generated method stub
			return userRepository.existsById(id);
		}
		
		public void deleteAllUsers() {
			  userRepository.deleteAll();
		  }
}
