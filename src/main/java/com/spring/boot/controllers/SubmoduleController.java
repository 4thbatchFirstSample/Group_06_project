package com.spring.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.entities.SubModule;
import com.spring.boot.services.SubModuleService;

@RestController
@RequestMapping(value = "/api/v1")
public class SubmoduleController {
	@Autowired
	private SubModuleService subModuleService;
	
	@PostMapping(value="/submodule")
	public ResponseEntity<Object>addsubmodule(@RequestBody SubModule subModule){
		subModuleService.addsubmodule(subModule);
		//SubModuleService.addsubmodule(subModule);
		return new ResponseEntity<Object>("Added", HttpStatus.OK);
		
	}
	
}
