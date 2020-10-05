package com.spring.boot.converters;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.spring.boot.dto.ModuleDto;
import com.spring.boot.dto.SubModuleDto;
import com.spring.boot.entities.ModuleNew;
import com.spring.boot.entities.SubModule;
import java.util.ArrayList;
import com.spring.boot.dto.ModuleDto;
import com.spring.boot.entities.ModuleNew;
import java.util.List;

@Service
public class SubmoduleConverter {
public static SubModule submoduleDtoToSubModule(SubModuleDto submoduledto) {
	SubModule submodule=new SubModule();
	ModuleNew module = new ModuleNew();
		if (submoduledto!=null) {
			submodule.setId(submoduledto.getId());
			submodule.setSubmodulename(submoduledto.getSubmodulename());
			submodule.setSubmodulestatus(submoduledto.getSubmodulestatus());
			module.setId(submoduledto.getModuleId());
			submodule.setModulenew(module);
			return submodule;
		}
		return null;
	}
//entity to dto
public static List<SubModuleDto> submoduletoSubmoduledto(List<SubModule> submodulelist){
	List<SubModuleDto>submoduledto=new ArrayList<>();
	if(submodulelist!=null) {
		for(SubModule submodule:submodulelist) {
			SubModuleDto submoduledto1=new SubModuleDto();
			submoduledto1.setId(submodule.getId());
			submoduledto1.setSubmodulename(submodule.getSubmodulename());
			submoduledto1.setSubmodulestatus(submodule.getSubmodulestatus());
			submoduledto1.setModuleId(submodule.getModulenew().getId());
			submoduledto.add(submoduledto1);
		}
		
		return submoduledto;
	}
	return null;
	
}

}