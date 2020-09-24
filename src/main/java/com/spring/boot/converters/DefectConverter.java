package com.spring.boot.converters;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.spring.boot.dto.DefectDto;
import com.spring.boot.entities.Defect;

@Service
public class DefectConverter {
	//
	//defectDto >> defect
	public static Defect defectDtoToDefect(DefectDto defectDto) {
		Defect defect = new Defect();
		if(defectDto !=null) {
			
			defect.setDefectId(defectDto.getId());
			defect.setDefectName(defectDto.getDiscription());
			defect.setDefectType(defectDto.getType());
			defect.setDefectStatus(defectDto.getStatus());
			defect.setDefectSeverity(defectDto.getSeverity());
			defect.setDefectPriority(defectDto.getPriority());
			defect.setDefectSubModule(defectDto.getSubModule());
			defect.setDefectEnteredBy(defectDto.getEnteredBy());
			defect.setDefectAssignTo(defectDto.getAssignTo());
			return defect;
		}
		
		
		
		
		
		return null;
		
		
	}
	
	//entity 
	//defect >>defectDto
	
	public static List<DefectDto> defectTodefectDto(List<Defect> defectList){
		List<DefectDto> listDefectDto =new ArrayList<>();
		
		if(defectList !=null) {
			
			for(Defect defect :defectList) {
				DefectDto defectDto =new DefectDto();
				defectDto.setId(defect.getDefectId());
				defectDto.setDiscription(defect.getDefectName());
				defectDto.setType(defect.getDefectType());
				defectDto.setStatus(defect.getDefectStatus());
				defectDto.setSeverity(defect.getDefectSeverity());
				defectDto.setPriority(defect.getDefectPriority());
				defectDto.setSubModule(defect.getDefectSubModule());
				defectDto.setEnteredBy(defect.getDefectEnteredBy());
				defectDto.setAssignTo(defect.getDefectAssignTo());
				
			}
			return listDefectDto;
		}
		
		
		return null;
		
		
	}
	
	
}
