package com.spring.boot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;



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
	private String defectEnteredBy;
	
	
	@ManyToOne
	@JoinColumn(name = "subModuleId", nullable = false)
	private SubModule subModule;
	
	public SubModule getSubModule() {
		return subModule;
	}
	public void setSubModule(SubModule subModule) {
		this.subModule = subModule;
	}
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
	
	public String getDefectEnteredBy() {
		return defectEnteredBy;
	}
	public void setDefectEnteredBy(String defectEnteredBy) {
		this.defectEnteredBy = defectEnteredBy;
	}
	
	 
	 
}