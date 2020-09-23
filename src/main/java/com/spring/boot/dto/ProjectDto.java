package com.spring.boot.dto;

public class ProjectDto {
	private Long ProjectId;
	private String ProjectName;
	private String abbreviation;


	public Long getProjectId() {
		return ProjectId;
	}

	public void setProjectId(Long projectId) {
		ProjectId = projectId;
	}

	public String getProjectName() {
		return ProjectName;
	}

	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

}
