package com.spring.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entities.SubModule;
import com.spring.boot.repositories.SubModuleRepository;

@Service
public class SubModuleSerivcelmpl implements SubModuleService{
	@Autowired
	private SubModuleRepository submoduleRepository;
	
	@Override
	public void addsubmodule(SubModule submodule) {
		submoduleRepository.save(submodule);
		
	}
	@Override
	public List<SubModule> getAllSubModule() {
		return submoduleRepository.findAll();
	}
	@Override
	public void deletesubmodule(Long id) {
		submoduleRepository.deleteById(id);
		
	}
	@Override
	public List<SubModule> getsubmoduleidfrommoduleid(Long id) {
		
		return null;
	}
	

}
