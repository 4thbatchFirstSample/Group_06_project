package com.spring.boot.services;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.spring.boot.entities.User;

public class CustomUserDetails implements UserDetails {

	/**
	 * 
	 */
//	private static final long serialVersionUID = 4049564621338257808L;
	private User user;
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return user.getUserRole().stream().map(role->new SimpleGrantedAuthority("ROLE"+role)).collect(Collectors.toList());
	}

	@Override
	public String getPassword() {
		
		return user.getPassWord();
	}

	@Override
	public String getUsername() {
		
		return user.getUserName();
	}

	@Override
	public boolean isAccountNonExpired() {
		
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		
		return true;
	}

	@Override
	public boolean isEnabled() {
		
		return true;
	}

}
