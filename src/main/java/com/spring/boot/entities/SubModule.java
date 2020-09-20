package com.spring.boot.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class SubModule {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long submoduleid;
	private String  submodulename;
	private String submodulestatus;
	public Long getSubmoduleid() {
		return submoduleid;
	}
	public void setSubmoduleid(Long submoduleid) {
		this.submoduleid = submoduleid;
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
