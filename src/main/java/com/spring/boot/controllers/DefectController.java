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
	
	
	@PostMapping(value = "/defect")
	public ResponseEntity<Object> addDefect(@RequestBody DefectDto defectDto) {
		  defectService.addDefect(DefectConverter.defectDtoToDefect(defectDto));
		  
		 return new ResponseEntity<Object>("New defect added!!!",HttpStatus.CREATED);
	}
	
	//getAllDefects
	
	@GetMapping("/defects")
	public List<DefectDto> getAll(){
		return DefectConverter.defectsToDefectDtos(defectService.getAllDefects());
	}

	
	//getDefectById
	@GetMapping("defect/id/{id}")
	public DefectDto getById(@PathVariable long id) {
		return DefectConverter.defectToDefectDto(defectService.getDefectByID(id));
	}
	
	
	//updateDefect
	
	@PutMapping("/updates")
	public ResponseEntity<Object>   updateDefect(@RequestBody DefectDto defectDto) {
		defectService.updateDefect(DefectConverter.defectDtoToDefect(defectDto));
		return new ResponseEntity<Object>("Updated",HttpStatus.OK);
		
	}

	
	//deleteDefect
	@DeleteMapping("/deletedefect/{id}")
	public String deleteDefect(@PathVariable long id) {
		defectService.deleteDefect(id);
		return "Defect Deleted";
	}
	
	//status

	@GetMapping("/defects/status/{status}")
	public List<DefectDto> findBydefectStatus(@PathVariable String status){
		return DefectConverter.defectsToDefectDtos(defectService.getBydefectStatus(status));
	}
	
	//S
	@GetMapping("/defects/severity/{severity}")
	public List<DefectDto> findBydefectSeverity(@PathVariable String severity){
		return DefectConverter.defectsToDefectDtos(defectService.getBydefectSeverity(severity));
	}
	
	//p
	@GetMapping("/defects/priority/{priority}")
	public List<DefectDto> findBydefectPriority(@PathVariable String priority){
		
		return DefectConverter.defectsToDefectDtos(defectService.getBydefectPriority(priority));
	}
	
	
	//findByMuduleid
	@GetMapping("defect/module/{id}")
	public List<DefectDto> getByModuleId(@PathVariable long id) {
		return DefectConverter.defectsToDefectDtos(defectService.getBySubModule(id));
		
	}
	

}


