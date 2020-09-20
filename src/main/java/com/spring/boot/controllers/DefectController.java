package com.spring.boot.controllers;

import java.util.List;

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

import com.spring.boot.services.DefectService;
import com.spring.boot.entities.Defect;

@RestController
@RequestMapping(value = "api/v1")
public class DefectController {
	@Autowired
	private DefectService defectService;
	
	//addDefect
	@PostMapping("/defect")
	public Defect addDefect(@RequestBody Defect defect) {
		return defectService.addDefect(defect);
		
	}
	
	//getAllDefects
	
	@GetMapping("/defects")
	public List<Defect> getAll(){
		return defectService.getAllDefects();
	}

	
	//getDefectById
	@GetMapping("defect/id/{id}")
	public Defect getById(@PathVariable long id) {
		
		
		return defectService.getDefectByID(id) ;
		
		
	}
	
	
	//updateDefect
	
	@PutMapping("/updates")
	public ResponseEntity<Object>   updateDefect(@RequestBody Defect defect) {
		 defectService.updateDefect(defect);
		 return new ResponseEntity<Object>("Updated",HttpStatus.OK);
		
	}

	
	//deleteDefect
	@DeleteMapping("/deletedefect/{id}")
	public String deleteDefect(@PathVariable long id) {
		
		defectService.deleteDefect(id);
		
		return "Defect Deleted";
		
		
		
	}
	
	
	

}


