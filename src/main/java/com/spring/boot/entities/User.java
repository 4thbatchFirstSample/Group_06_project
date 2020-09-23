package com.spring.boot.entities;
import javax.persistence.JoinColumn;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name ="userTbl" )
public class User {
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;
	private String userName;
	private String userRole;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
	//ManytoManyRelationship with submodules

	  @ManyToMany(cascade = { CascadeType.ALL })
	    @JoinTable(
	            name = "SubModUserTbl",
	            joinColumns = { @JoinColumn(name = "userId", referencedColumnName = "userId") },
	            inverseJoinColumns = { @JoinColumn(name = "subModuleId",referencedColumnName = "subModuleId") }
	            )
	 
	 private Set<SubModule> subModules = new HashSet<>();
}
