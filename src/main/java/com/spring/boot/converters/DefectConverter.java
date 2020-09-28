package com.spring.boot.converters;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.spring.boot.dto.DefectDto;
import com.spring.boot.entities.Defect;
import com.spring.boot.entities.SubModule;

@Service
public class DefectConverter {
	//dtoToEntity (post)
	//defectDto >> defect
	public static Defect defectDtoToDefect(DefectDto defectDto) {
		Defect defect = new Defect();
		SubModule suModule = new SubModule();
		if(defectDto !=null) {
			defect.setDefectId(defectDto.getId());
			defect.setDefectName(defectDto.getDiscription());
			defect.setDefectType(defectDto.getType());
			defect.setDefectStatus(defectDto.getStatus());
			defect.setDefectSeverity(defectDto.getSeverity());
			defect.setDefectPriority(defectDto.getPriority());
			defect.setDefectEnteredBy(defectDto.getEnteredBy());
			suModule.setId(defectDto.getSubModuleId());
			
			defect.setSubModule(suModule);
			return defect;
		}
		

		
		
		
		return null;
		
		
	}
	
	

	//getOneDefect
	public static DefectDto defectToDefectDto(Defect defect) {
		DefectDto defectDto = new DefectDto();
		if(defect !=null) {
			
			defectDto.setId(defect.getDefectId());	
			defectDto.setDiscription(defect.getDefectName());
			defectDto.setType(defect.getDefectType());
			defectDto.setStatus(defect.getDefectStatus());
			defectDto.setSeverity(defect.getDefectSeverity());
			defectDto.setPriority(defect.getDefectPriority());
			defectDto.setEnteredBy(defect.getDefectEnteredBy());
			defectDto.setSubModuleId(defect.getSubModule().getId());
			
			
			return defectDto;
		}
		
		
	
		
		
		return null;
		
		
	}
	
	//getAll
	//defectEntityToDefectDto
	public static List<DefectDto> defectsToDefectDtos(List<Defect> defectsList){
		List<DefectDto> defectDtoList=new ArrayList<>();
		
		if(defectsList !=null) {
			
			for(Defect defect:defectsList) {
				DefectDto defectDto =new DefectDto();
				
				defectDto.setId(defect.getDefectId());	
				defectDto.setDiscription(defect.getDefectName());
				defectDto.setType(defect.getDefectType());
				defectDto.setStatus(defect.getDefectStatus());
				defectDto.setSeverity(defect.getDefectSeverity());
				defectDto.setPriority(defect.getDefectPriority());
				defectDto.setEnteredBy(defect.getDefectEnteredBy());
				
				defectDto.setSubModuleId(defect.getSubModule().getId());

				defectDtoList.add(defectDto);		
			}
			return defectDtoList;
		}
		return null;
		
		
		
	}
	
	
}
