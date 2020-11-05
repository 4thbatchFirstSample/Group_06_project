package com.spring.boot.converters;
import java.util.ArrayList;
import com.spring.boot.dto.ModuleDto;
import com.spring.boot.dto.SubModuleDto;
import com.spring.boot.entities.ModuleNew;
import com.spring.boot.entities.SubModule;

import java.util.List;

public class ModuleConverter {
	//module dto to entity 
	public static ModuleNew moduleDtoTomodule(ModuleDto moduledto) {
		ModuleNew module=new ModuleNew();
		if (moduledto!=null) {
			module.setId(moduledto.getId());
			module.setName(moduledto.getName());
			module.setStatus(moduledto.getStatus());
			return module;
		}
		return null;
	}
	
	//entity to moduledto	
	public static List<ModuleDto> ModuleToModuleDto(List<ModuleNew> modulelist){
		List<ModuleDto> ModuleDtoList=new ArrayList<>();
		if(modulelist!=null) {
			for(ModuleNew module:modulelist) {
				ModuleDto moduledto=new ModuleDto();
				moduledto.setId(module.getId());
				moduledto.setName(module.getName());
				moduledto.setStatus(module.getStatus());								
				
			}
		}
		return null;
	}

	
	
	
}
