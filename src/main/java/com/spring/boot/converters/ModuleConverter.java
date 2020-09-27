package com.spring.boot.converters;

import com.spring.boot.dto.ModuleDto;
import com.spring.boot.entities.ModuleNew;
import com.spring.boot.entities.SubModule;

public class ModuleConverter {
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
	

}
