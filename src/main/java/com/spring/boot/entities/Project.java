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
@Table(name ="projectTbl" )
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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






	//Parent Relationship with module
	 @OneToMany(mappedBy="projects")
	 private Set<Module> module = new HashSet<>();
	  
}
