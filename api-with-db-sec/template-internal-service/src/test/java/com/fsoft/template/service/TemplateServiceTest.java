/***************************************************************************
 * Copyright 2016 by HomeDirect - All rights reserved.                *    
 **************************************************************************/
package com.fsoft.template.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import org.apache.tomcat.jdbc.pool.DataSource;
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

import com.fsoft.template.model.Coupon;
import com.fsoft.template.model.User;

/**
 *  Author : Nhu Dinh Thuan
 *          Email:thuan.nhu@homedirect.com.vn
 * Jan 18, 2018
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@SpringBootApplication
@ImportResource("classpath:application-config.xml")
@PropertySource("classpath:application.properties")
@EnableAutoConfiguration(exclude={
    DataSourceAutoConfiguration.class,
    JpaRepositoriesAutoConfiguration.class,
    HibernateJpaAutoConfiguration.class,
    DataSourceTransactionManagerAutoConfiguration.class,
    org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class
})
public class TemplateServiceTest {
  
  final static Logger logger = LoggerFactory.getLogger(TemplateServiceTest.class);
  
  @Autowired
  private UserService userService;
  
  @Autowired
  private CouponService couponService;
  
  
  
 /* @Autowired
  private  DataSource dataSource;*/
  
  @Test
  public void test()  {
//	System.out.println(dataSource.getConnection().getMetaData().getTables(null, "MSIWEB", "user_test", null));
	
//	  try {
//	Connection connection = dataSource.getConnection();
//	
//	ResultSet resultSet = connection.createStatement().executeQuery("select * from MSIWEB.user_test");
//	System.out.println("---->" + resultSet.getInt(0));
//	  } catch (Exception e) {
//		  e.printStackTrace();
//	}
	  
   assertNotNull(couponService);
    
 /* User user = new User();
    user.setUsername("yendv1");
    user.setEmail("yendv1@gmail.com");
    user.setFullname("yendv");
    user.setPhone("096553332912313123");
    user.setPassword("123456");
    
    userService.registryUser(user);
    System.err.println(user.getFullname());*/
    
    /*Optional<User> optional = userService.get(user.getUsername());
    
    assertTrue(optional.isPresent());
    assertEquals(optional.get().getPhone(), user.getPhone());*/
    
    
   Coupon c = new Coupon();
    java.sql.Date date = new java.sql.Date(new java.util.Date().getTime());
    try {
    	/*couponService.orderBasicUpdateQuery("000000000000000",
        		"0000000orderId", date,
        		"000000000mdfId", null,
        		"000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000test");*/
	} catch (Exception e) {
		e.printStackTrace();
	}
    System.err.println("hhiihiihhihihihih");
  }
}
