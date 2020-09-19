package com.spring.boot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
}
