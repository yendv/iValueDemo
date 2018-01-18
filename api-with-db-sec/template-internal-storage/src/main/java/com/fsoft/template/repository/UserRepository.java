package com.fsoft.template.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsoft.template.model.User;

public interface UserRepository extends JpaRepository<User, String>{

}