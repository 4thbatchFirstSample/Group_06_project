package com.spring.boot.converters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.dto.ProjectDto;
import com.spring.boot.entities.Project;

@Service
public class ProjectConverter {
	// projectDto to Project Entity Converter
	public static Project projectDtoToProject(ProjectDto projectDto) {
		Project project = new Project();
		if (projectDto != null) {
			project.setProjectId(projectDto.getProjectId());
			project.setProjectName(projectDto.getProjectName());
			project.setAbbreviation(projectDto.getAbbreviation());
			return project;
		}
		return null;
	}

	
	// projectEntity to ProjectDto Converter
	public static ProjectDto projectToProjectDto(Project project) {
		ProjectDto projectDto = new ProjectDto();
		if (project != null) {
			projectDto.setProjectId(project.getProjectId());
			projectDto.setProjectName(project.getProjectName());
			projectDto.setAbbreviation(project.getAbbreviation());
			return projectDto;
		}
		return null;
	}

	
	
	
	// projectDtoList to Project Entity List Converter
		public static List<Project> projectDtoListToProjectList(List<ProjectDto> projectDtoList) {
			List<Project> listProject = new ArrayList<>();
			
			if (projectDtoList != null) {
				for (ProjectDto projectDto : projectDtoList) {
					Project project = new Project();
				
					project.setProjectId(projectDto.getProjectId());
					project.setProjectName(projectDto.getProjectName());
					project.setAbbreviation(projectDto.getAbbreviation());
				
				listProject.add(project);
			}
				return listProject;
			}
			return null;
		}
	
	
			
	
	// Project List to ProjectDto list converter

	public static List<ProjectDto> projectListToProjectDtoList(List<Project> projectList) {
		List<ProjectDto> listProjectDto = new ArrayList<>();
		if (projectList != null) {
			for (Project project : projectList) {
				ProjectDto projectDto = new ProjectDto();
				projectDto.setProjectId(project.getProjectId());
				projectDto.setProjectName(project.getProjectName());
				projectDto.setAbbreviation(project.getAbbreviation());

				listProjectDto.add(projectDto);
			}
			return listProjectDto;
		}
		return null;

	}

}
