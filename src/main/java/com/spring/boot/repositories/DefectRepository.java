package com.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.entities.Defect;


@Repository
public interface DefectRepository extends JpaRepository<Defect, Long> {

}
