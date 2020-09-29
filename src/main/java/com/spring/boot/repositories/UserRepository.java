package com.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.spring.boot.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {

}
