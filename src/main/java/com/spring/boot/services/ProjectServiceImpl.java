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

	 public void saveProjects(List<Project> projects) {
	         projectRepository.saveAll(projects);
	    }
	 
	  public Project getProjectById(long id) {
	        return projectRepository.findById(id).orElse(null);
	    }
	  
	  
	  
	  @Override
	  public void updateProject(Project project) {
			// TODO Auto-generated method stub
			
		  Project existProject = projectRepository.findById(project.getProjectId()).orElse(null);
		
		  existProject.setProjectName(project.getProjectName());
		  existProject.setAbbreviation(project.getAbbreviation());
		
		  projectRepository.save(existProject);
		}
	  
	  
	  @Override
		public void deleteProject(Long id) {
		  projectRepository.deleteById(id);
			
		}

		@Override
		public boolean existsById(Long id) {
			// TODO Auto-generated method stub
			return projectRepository.existsById(id);
		}
		
		  public void deleteAllProjects() {
			  projectRepository.deleteAll();
		  }
}
