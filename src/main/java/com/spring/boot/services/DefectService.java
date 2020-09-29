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
		
		public List<Defect> getBydefectStatus(String defectStatus);
	
	//defectSeverity
		
		public List<Defect> getBydefectSeverity(String defectSeverity);
		
		
	//defectPriority
		
		public List<Defect> getBydefectPriority(String defectPriority);
		
	//findbysubmoduleID
		
		public List<Defect> getBySubModule(Long id);

		
		//count
		public long countStatus(String status);
		public long countSeverity(String severity);
		public long countPriority(String priority);
		
		//checkID
		public boolean existsById(Long id);
		
		
		
		
		
	
}
