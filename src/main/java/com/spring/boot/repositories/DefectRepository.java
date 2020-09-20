package com.spring.boot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.entities.Defect;


@Repository
public interface DefectRepository extends JpaRepository<Defect, Long> {
	List<Defect> findBydefectStatusContaining(String defectStatus);
}
