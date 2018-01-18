/***************************************************************************
 * Copyright 2016 by fsoft - All rights reserved.                *    
 **************************************************************************/
package com.fsoft.template.request;

/**
 *  Author : Nhu Dinh Thuan
 *          Email:nhudinhthuan@gmail.com
 * Nov 16, 2017
 */
public class LoginRequest {

  private String username;
  
  private String password;
  
  public LoginRequest() {
    
  }
  
  public LoginRequest(String username, String password) {
    this.username = username;
    this.password = password;
  }
  
  public String getUsername() {  return username; }
  public void setUsername(String username) { this.username = username; }

  public String getPassword() { return password; }
  public void setPassword(String password) { this.password = password; }
}
