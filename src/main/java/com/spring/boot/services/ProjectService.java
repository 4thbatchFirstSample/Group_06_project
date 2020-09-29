package com.spring.boot.services;

import java.util.List;

import com.spring.boot.entities.Project;

public interface ProjectService {
	public void addProject(Project project);
	public List<Project> getProjects() ;
	public void saveProjects(List<Project> projects);
	  public Project getProjectById(long id) ;
	  public void updateProject(Project project);
	  public void deleteProject(Long id);
	  public boolean existsById(Long id);
	  public void deleteAllProjects();
}
