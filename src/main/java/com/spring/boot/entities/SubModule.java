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
	public String getSubmodulename() {
		return submodulename;
	}
	public void setSubmodulename(String submodulename) {
		this.submodulename = submodulename;
	}
	public String getSubmodulestatus() {
		return submodulestatus;
	}
	public void setSubmodulestatus(String submodulestatus) {
		this.submodulestatus = submodulestatus;
	}
	
	
		
}
