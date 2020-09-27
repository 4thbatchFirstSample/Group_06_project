package com.spring.boot.converters;
import org.springframework.stereotype.Service;
import com.spring.boot.dto.SubModuleDto;
import com.spring.boot.entities.SubModule;

@Service
//dto to entity
public class SubmoduleConverter {
public static SubModule submoduleDtoToSubModule(SubModuleDto submoduledto) {
	SubModule submodule=new SubModule();
	if (submoduledto!=null) {
		submodule.setId(submoduledto.getId());
		submodule.setSubmodulename(submoduledto.getSubmodulename());
		submodule.setSubmodulestatus(submoduledto.getSubmodulestatus());
	return submodule;
	}
	
	
	return null;

}
}