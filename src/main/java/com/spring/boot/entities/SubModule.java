package com.spring.boot.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import antlr.collections.List;

@Entity
@Table(name ="subModuleTbl" )
public class SubModule {
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long subModuleId;
	private String subModuleName;
	private String subModuleDesc;
	public long getSubModuleId() {
		return subModuleId;
	}
	public void setSubModuleId(long subModuleId) {
		this.subModuleId = subModuleId;
	}
	public String getSubModuleName() {
		return subModuleName;
	}
	public void setSubModuleName(String subModuleName) {
		this.subModuleName = subModuleName;
	}
	public String getSubModuleDesc() {
		return subModuleDesc;
	}
	public void setSubModuleDesc(String subModuleDesc) {
		this.subModuleDesc = subModuleDesc;
	}
	
	
	//Child relationship with module
	 @ManyToOne
	 @JoinColumn(name = "moduleId")
	 private Module modules;
	
		
		//Parent Relationship with Defect	
		 @OneToMany(mappedBy="subModules")
		 private Set<Defect> defects = new HashSet<>();


		 //MantToMany relationship with user
		 @ManyToMany(mappedBy = "subModules")
		 private Set<User> users = new HashSet<>();
}




