package com.spring.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.spring.boot.entities.Project;
import com.spring.boot.repositories.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public void addProject(Project project) {
		projectRepository.save(project);

	}
	
	 public List<Project> getProjects() {
	        return projectRepository.findAll();
	    }

	 public List<Project> saveProjects(List<Project> projects) {
	        return projectRepository.saveAll(projects);
	    }
	 
	  public Project getProjectById(long id) {
	        return projectRepository.findById(id).orElse(null);
	    }
	  

}
