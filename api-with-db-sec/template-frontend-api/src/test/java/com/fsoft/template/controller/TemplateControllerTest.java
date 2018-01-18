/***************************************************************************
 * Copyright 2016 by HomeDirect - All rights reserved.                *    
 **************************************************************************/
package com.fsoft.template.controller;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fsoft.template.front.controller.UserController;
import com.fsoft.template.request.LoginRequest;
import com.fsoft.template.request.UserRegistryRequest;
import com.fsoft.template.response.TemplateResponse;

/**
 *  Author : Nhu Dinh Thuan
 *          Email:thuan.nhu@homedirect.com.vn
 * Jan 18, 2018
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest
//@SpringBootApplication
//@ImportResource("classpath:application-config.xml")
//@PropertySource("classpath:application.properties")
//@EnableAutoConfiguration(exclude={
//    DataSourceAutoConfiguration.class,
//    JpaRepositoriesAutoConfiguration.class,
//    HibernateJpaAutoConfiguration.class,
//    DataSourceTransactionManagerAutoConfiguration.class,
//    org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class
//})
public class TemplateControllerTest {

  final static Logger logger = LoggerFactory.getLogger(TemplateControllerTest.class);
  
  @Autowired
  private UserController userController;
  
  @Test
  public void test() {
    assertNotNull(userController);
    
    UserRegistryRequest request = new UserRegistryRequest();
    request.setUsername("test12");
    request.setPassword("123456");
    request.setRePassword("123456");
    request.setEmail("vana@gmail.com");
    request.setFullname("Nguyen Van A");
    
    userController.registry(request);
    
    LoginRequest loginRequest = new LoginRequest(request.getUsername(), request.getPassword());
    TemplateResponse<String> response = userController.login(loginRequest);
    
    logger.info(response.getCode() + " : " + response.getDescription());
  }
}
