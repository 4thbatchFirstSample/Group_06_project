package com.spring.boot.services;

import java.util.List;

import com.spring.boot.entities.ModuleNew;

public interface ModuleService {
	public void addModule(ModuleNew module);
	public List<ModuleNew> getAllModule();
	public void deletemodule(Long id);
}
