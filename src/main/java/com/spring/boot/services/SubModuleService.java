package com.spring.boot.services;
import java.util.List;
import com.spring.boot.entities.SubModule;

public interface SubModuleService {
	public void addsubmodule(SubModule submodule);
	public List<SubModule>getAllSubModule();

}
