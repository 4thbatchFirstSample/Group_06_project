package com.spring.boot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;



@Entity
@Table
public class SubModule {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@NotBlank
	private String submodulename;
	private String submodulestatus;

	//Relationship
	@ManyToOne
	@JoinColumn(name="moduleid",nullable=false)
	private ModuleNew modulenew;
	
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
	public ModuleNew getModulenew() {
		return modulenew;
	}
	public void setModulenew(ModuleNew modulenew) {
		this.modulenew = modulenew;
	}
	
	
		
}
