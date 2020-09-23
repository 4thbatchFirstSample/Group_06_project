package com.spring.boot.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="defectTbl" )
public class Defect {
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long defectId;
	private String defectName;
	private String defectType;
	private String defectStatus;
	private String defectSeverity;
	private String defectPriority;
	private String defectSubModule;
	private String defectEnteredBy;
	private String defectAssignTo;
	public long getDefectId() {
		return defectId;
	}
	public void setDefectId(long defectId) {
		this.defectId = defectId;
	}
	public String getDefectName() {
		return defectName;
	}
	public void setDefectName(String defectName) {
		this.defectName = defectName;
	}
	public String getDefectType() {
		return defectType;
	}
	public void setDefectType(String defectType) {
		this.defectType = defectType;
	}
	public String getDefectStatus() {
		return defectStatus;
	}
	public void setDefectStatus(String defectStatus) {
		this.defectStatus = defectStatus;
	}
	public String getDefectSeverity() {
		return defectSeverity;
	}
	public void setDefectSeverity(String defectSeverity) {
		this.defectSeverity = defectSeverity;
	}
	public String getDefectPriority() {
		return defectPriority;
	}
	public void setDefectPriority(String defectPriority) {
		this.defectPriority = defectPriority;
	}
	public String getDefectSubModule() {
		return defectSubModule;
	}
	public void setDefectSubModule(String defectSubModule) {
		this.defectSubModule = defectSubModule;
	}
	public String getDefectEnteredBy() {
		return defectEnteredBy;
	}
	public void setDefectEnteredBy(String defectEnteredBy) {
		this.defectEnteredBy = defectEnteredBy;
	}
	public String getDefectAssignTo() {
		return defectAssignTo;
	}
	public void setDefectAssignTo(String defectAssignTo) {
		this.defectAssignTo = defectAssignTo;
	}
	
	
	//Child relationship with submodule
	@ManyToOne
	 @JoinColumn(name = "subModuleId")
	 private SubModule subModules;
	 
}