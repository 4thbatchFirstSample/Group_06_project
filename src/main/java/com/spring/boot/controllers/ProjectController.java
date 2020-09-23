package com.spring.boot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.spring.boot.converters.ProjectConverter;
import com.spring.boot.dto.ProjectDto;
import com.spring.boot.entities.Project;
import com.spring.boot.services.ProjectService;

@RestController
@RequestMapping(value ="api/v1")
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	
	//Add project
	@PostMapping(value = "/project")
	public ResponseEntity<Object> addProject(@RequestBody ProjectDto projectDto) {
		projectService.addProject(ProjectConverter.projectDtoToProject(projectDto));
		return new ResponseEntity<Object>("Added Successfully", HttpStatus.CREATED);
	}
	
	//Get all projects
	
//	@GetMapping("/AllProjects")
//	public List<Project> findAllProjectss() {
//	    return projectService.getProjects();
//	}
	
	@GetMapping("/AllProjects")
	public ResponseEntity<Object> findAllProjectss() {
		ProjectConverter.projectToProjectDto(projectService.getProjects());
		return new ResponseEntity<Object>("Retrieved Successfully", HttpStatus.CREATED);
	}

	
	//Add projects

//	@PostMapping("/addProjects")
//	public List<Project> addProjects(@RequestBody List<Project> project) {
//	    return projectService.saveProjects(project);
//	}
//	
	

	@PostMapping(value = "/addProjects")
	public ResponseEntity<Object> addProjects(@RequestBody List<ProjectDto> projectDtoList) {
		projectService.saveProjects(ProjectConverter.projectDtoListToProjectList(projectDtoList));
		return new ResponseEntity<Object>("Added Successfully", HttpStatus.CREATED);
	}
	
	//Get project by Id
	
//	@GetMapping("/projectById/{id}")
//	public Project findProjectById(@PathVariable long id) {
//	    return projectService.getProjectById(id);
//	}


	@GetMapping("/projectById/{id}")
	public ResponseEntity<Object> findProjById(@PathVariable long id) {
		ProjectConverter.projectToProjectDto(projectService.getProjectById(id));
		return new ResponseEntity<Object>("Retrieved Successfully", HttpStatus.CREATED);
	}

}





