package com.spring.boot.dto;

public class SubModuleDto {
	private Long id;
	private String submodulename;
	private String submodulestatus;
	private Long moduleId;
	
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
	public Long getModuleId() {
		return moduleId;
	}
	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
	}
	


}
