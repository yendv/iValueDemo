package com.fsoft.template.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fsoft.template.model.User;

public interface UserRepository extends JpaRepository<User, String>{
	@Transactional
	@Modifying
	@Query("UPDATE User " + 
			"SET phone     = :phone " + 
			 "WHERE username     = :username" 
			
			)
	public Integer updatetest(
			@Param("phone") String phone ,
			@Param("username") String username);
}