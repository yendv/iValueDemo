package com.fsoft.template.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsoft.template.model.TestApi;

public interface TestApiRespository extends JpaRepository<TestApi, String>{

}
