package com.spring.boot.services;

import java.util.List;

import com.spring.boot.entities.Defect;

public interface DefectService {
	//addDefect
		public Defect addDefect(Defect defect);
	
	
	
	//getAllDefects
		public List<Defect> getAllDefects();
	
	//getDefectById
	
		public Defect getDefectByID(Long id);
		
	
	//updateDefect
	
		public void updateDefect(Defect defect);
		
	//delete
		
		public void deleteDefect(Long id);
		
	//getBydefectStatus
		
		List<Defect> getBydefectStatusContaining(String defectStatus);
	
	//defectSeverity
		
		List<Defect> getBydefectSeverityContaining(String defectSeverity);
		
		
	//defectPriority
		
		List<Defect> getBydefectPriorityContaining(String defectPriority);
		
		
		
		
	
}
