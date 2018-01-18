/***************************************************************************
 * Copyright 2016 by fsoft - All rights reserved.                *    
 **************************************************************************/
package com.fsoft.template.response;

/**
 *  Author : Nhu Dinh Thuan
 *          Email:nhudinhthuan@gmail.com
 * Nov 16, 2017
 */
public class LoggedUser {
  
  private String username;
  
  private String role;
  
  public String getUsername() {  return username; }
  public void setUsername(String username) { this.username = username; }

  public String getRole() { return role; }
  public void setRole(String value) { this.role = value; }

}
