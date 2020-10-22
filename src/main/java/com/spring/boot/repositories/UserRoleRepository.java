package com.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.entities.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole, Integer>{

}
