package com.spring.boot.services;
import java.util.List;
import com.spring.boot.entities.SubModule;

public interface SubModuleService {
	//add
	public void addsubmodule(SubModule submodule);
	//get
	public List<SubModule> getAllSubModule();
	//delete
	public void deletesubmodule(Long id);
	
	public List<SubModule>getsubmoduleidfrommoduleid(Long id);
	

}
