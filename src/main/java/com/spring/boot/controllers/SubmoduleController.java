package com.spring.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		return new ResponseEntity<Object>("Sub Module Added", HttpStatus.OK);
		
	}
	
	@GetMapping(value ="/submodule/view")
	public ResponseEntity<Object>getsubmodule(){
		return new ResponseEntity<Object>(subModuleService.getAllSubModule(), HttpStatus.OK);
	}
	
	@PutMapping(value = "/submodule/update")
	public ResponseEntity<Object> updateModule(@RequestBody SubModule submodule){
		subModuleService.addsubmodule(submodule);
		return new ResponseEntity<Object>("Sub Module Updated", HttpStatus.OK);
	}
	@DeleteMapping(value="submodule/delete/{id}")
	public String deletemodule(@PathVariable Long id) {
		subModuleService.deletesubmodule(id);
		return "Sub Module Deleted";	
}}
