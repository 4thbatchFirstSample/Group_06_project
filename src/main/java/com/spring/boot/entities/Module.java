package com.spring.boot.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="moduleTbl" )
public class Module {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long moduleId;
	private String moduleName;
	private String moduleDesc;
	public long getModuleId() {
		return moduleId;
	}
	public void setModuleId(long moduleId) {
		this.moduleId = moduleId;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public String getModuleDesc() {
		return moduleDesc;
	}
	public void setModuleDesc(String moduleDesc) {
		this.moduleDesc = moduleDesc;
	}
	
	
	
	//Child Relationship with project
	 @ManyToOne
	 @JoinColumn(name = "ProjectId")
	 private Project projects;
	    
	
	//Parent Relationship with project	
	 @OneToMany(mappedBy="modules")
	 private Set<SubModule> subModule = new HashSet<>();

}
