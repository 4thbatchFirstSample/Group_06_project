package com.spring.boot.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

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
import com.spring.boot.counter.Count;
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
	
	@GetMapping(value ="/defects")
	public List<DefectDto> getAll(){
		return DefectConverter.defectsToDefectDtos(defectService.getAllDefects());
	}

	
	//getDefectById
	@GetMapping(value ="defect/id/{id}")
	public DefectDto getById(@PathVariable long id) {
		return DefectConverter.defectToDefectDto(defectService.getDefectByID(id));
	}
	
	//findByMuduleid
		@GetMapping("defect/module/{id}")
		public List<DefectDto> getByModuleId(@PathVariable long id) {
			return DefectConverter.defectsToDefectDtos(defectService.getBySubModule(id));
			
		}
		
	
	//updateDefect
	
	@PutMapping(value ="/updates")
	public ResponseEntity<Object>   updateDefect(@RequestBody DefectDto defectDto) {
		defectService.updateDefect(DefectConverter.defectDtoToDefect(defectDto));
		return new ResponseEntity<Object>("Updated",HttpStatus.OK);
		
	}

	
	//deleteDefect
	@DeleteMapping(value ="/defect/delete/{id}")
	public String deleteDefect(@PathVariable long id) {
		defectService.deleteDefect(id);
		return "Defect Deleted";
	}
	
	//status

	@GetMapping(value ="/defects/status/{status}")
	public List<DefectDto> findBydefectStatus(@PathVariable String status){
		
		return DefectConverter.defectsToDefectDtos(defectService.getBydefectStatus(status));
	}
	
	//severity
	@GetMapping(value ="/defects/severity/{severity}")
	public List<DefectDto> findBydefectSeverity(@PathVariable String severity){
		return DefectConverter.defectsToDefectDtos(defectService.getBydefectSeverity(severity));
	}
	
	//priority
	@GetMapping(value ="/defects/priority/{priority}")
	public List<DefectDto> findBydefectPriority(@PathVariable String priority){
		return DefectConverter.defectsToDefectDtos(defectService.getBydefectPriority(priority));
	}
	
	//countApi
	
	@GetMapping(value ="/defects/counts")
	public Count countAPI() {
		ArrayList<Count> countList=new ArrayList<>();
		Count count = new Count();
		
		count.setStatusClosed(defectService.countStatus("closed"));
		count.setStatusOpened(defectService.countStatus("opened"));
		count.setStatusReOpened(defectService.countStatus("reopened"));
		
		count.setSeverityHigh(defectService.countSeverity("high"));
		count.setSeverityLow(defectService.countSeverity("low"));
		count.setSeverityMedium(defectService.countSeverity("medium"));
		
		count.setPriorityHigh(defectService.countPriority("high"));
		count.setPriorityLow(defectService.countPriority("low"));
		count.setPriorityMedium(defectService.countPriority("medium")); 
//		countList.add(count);
		
		return count;
		
	}
	

}


