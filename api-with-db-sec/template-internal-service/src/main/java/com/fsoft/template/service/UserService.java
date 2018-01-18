
package com.fsoft.template.service;

import java.util.Optional;

import com.fsoft.template.model.User;

/**
 *  Author : Thuan.Nhu
 * Oct 27, 2017
 */
public interface UserService  {

  public String registryUser(User user);
 
  public Optional<User> get(String username);
}
