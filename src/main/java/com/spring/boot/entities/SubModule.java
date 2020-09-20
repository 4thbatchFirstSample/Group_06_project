package com.spring.boot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class SubModule {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String submodulename;
	private String submodulestatus;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return submodulename;
	}
	public void setName(String name) {
		this.submodulename = name;
	}
	public String getStatus() {
		return submodulestatus;
	}
	public void setStatus(String status) {
		this.submodulestatus = status;
	}
	
	
}
