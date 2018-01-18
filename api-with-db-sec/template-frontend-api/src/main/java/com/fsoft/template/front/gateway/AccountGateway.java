package com.fsoft.template.front.gateway;

import com.fsoft.template.exception.CommonException;
import com.fsoft.template.request.LoginRequest;
import com.fsoft.template.request.UserRegistryRequest;

/**
 *  Author : Nhu Dinh Thuan
 *          Email:nhudinhthuan@gmail.com
 * Nov 15, 2017
 */
public interface AccountGateway {

  public String registry(UserRegistryRequest request) throws CommonException;
  
  public String login(LoginRequest request) throws CommonException;

}
