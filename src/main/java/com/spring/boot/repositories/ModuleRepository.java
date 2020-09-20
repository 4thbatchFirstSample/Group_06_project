package com.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.entities.ModuleNew;

@Repository
public interface ModuleRepository extends JpaRepository<ModuleNew, Long> {

}
