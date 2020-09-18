package com.spring.boot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.repositories.DefectRepository;

@Service
public class DefectServiceImp implements DefectService {
	@Autowired
	DefectRepository defectRepository;
	
	
	
}
