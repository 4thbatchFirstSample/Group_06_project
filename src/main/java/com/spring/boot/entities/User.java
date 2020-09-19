package com.spring.boot.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class User {
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;
	private String defectName;
	private String defectType;
}
