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
import com.spring.boot.converters.DefectConverter;
import com.spring.boot.entities.Defect;
import com.spring.boot.dto.DefectDto;

@RestController
@RequestMapping(value = "api/v1")
public class DefectController {
	@Autowired
	private DefectService defectService;
	
	//addDefect
//	@PostMapping("/defect")
//	public Defect addDefect(@RequestBody Defect defect) {
//		return defectService.addDefect(defect);
//		
//	}
	
	
	@PostMapping(value = "/defect")
	public ResponseEntity<Object> addDefect(@RequestBody DefectDto defectDto) {
		  defectService.addDefect(DefectConverter.defectDtoToDefect(defectDto));
		 return new ResponseEntity<Object>("New defect added!!!",HttpStatus.CREATED);
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
	
	//status

	@GetMapping("/defects/status/active")
	public List<Defect> findBydefectStatusActive(){
		return defectService.getBydefectStatusContaining("active");
	}
	
	@GetMapping("/defects/status/closed")
	public List<Defect> findBydefectStatusClosed(){
		return defectService.getBydefectStatusContaining("closed");
	}
	
	@GetMapping("/defects/status/reopened")
	public List<Defect> findBydefectStatusReOpened(){
		return defectService.getBydefectStatusContaining("reopened");
	}
	
	//S
	
	@GetMapping("/defects/severity/high")
	public List<Defect> findBySeverityHigh(){
		return defectService.getBydefectSeverityContaining("high");
	}
	@GetMapping("/defects/severity/low")
	public List<Defect> findBySeverityLow(){
		return defectService.getBydefectSeverityContaining("low");
	}

	@GetMapping("/defects/severity/medium")
	public List<Defect> findBySeverityMedium(){
		return defectService.getBydefectSeverityContaining("medium");
	}

	
	//p
	@GetMapping("/defects/priority/high")
	public List<Defect> findByPriorityHigh(){
		return defectService.getBydefectPriorityContaining("high");
	}
	
	@GetMapping("/defects/priority/low")
	public List<Defect> findByPriorityLow(){
		return defectService.getBydefectPriorityContaining("low");
	}
	
	@GetMapping("/defects/priority/medium")
	public List<Defect> findByPriorityMedium(){
		return defectService.getBydefectPriorityContaining("medium");
	}
	
	
	//findByMuduleid
	@GetMapping("defect/module/{id}")
	public List<Defect> getByModuleId(@PathVariable long id) {
		
		
		return defectService.getBySubModule(id);
		
		
	}
	

}


