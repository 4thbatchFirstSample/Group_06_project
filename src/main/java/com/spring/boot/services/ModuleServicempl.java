package com.spring.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.repositories.ModuleRepository;
import com.spring.boot.entities.ModuleNew;

@Service
public class ModuleServicempl implements ModuleService {
	@Autowired
	private ModuleRepository moduleRepo;

	@Override
	public void addModule(ModuleNew module) {
		moduleRepo.save(module);
	}

	@Override
	public List<ModuleNew> getAllModule() {
		return moduleRepo.findAll();
	}

	@Override
	public void deletemodule(Long id) {
		 moduleRepo.deleteById(id);
		
	}

	

	
}
