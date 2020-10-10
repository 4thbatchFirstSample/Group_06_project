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
import com.spring.boot.converters.ModuleConverter;
import com.spring.boot.dto.ModuleDto;
import com.spring.boot.entities.ModuleNew;
import com.spring.boot.services.ModuleService;

@RestController
@RequestMapping(value = "/api/v1")
public class ModuleController {
	@Autowired
	private ModuleService moduleService;
	
	@PostMapping(value = "/module")
	public ResponseEntity<Object>addModule(@RequestBody ModuleDto moduleDto){
		moduleService.addModule(ModuleConverter.moduleDtoTomodule(moduleDto));
		return new ResponseEntity<Object>("Added", HttpStatus.OK);	
	}
	@GetMapping(value ="/module/view")
	public ResponseEntity<Object> getModule(){
		return new ResponseEntity<Object>(moduleService.getAllModule(), HttpStatus.OK);
	}
	
	@DeleteMapping(value="module/delete/{id}")
	public String deletemodule(@PathVariable Long id) {
		moduleService.deletemodule(id);
		return "Deleted";		
		
	}

	@PutMapping(value = "/module/update")
	public ResponseEntity<Object> updateModule(@RequestBody ModuleNew module){
		moduleService.addModule(module);
		return new ResponseEntity<Object>("Updated", HttpStatus.OK);
	}
	
}
