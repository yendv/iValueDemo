package com.fsoft.template.front.transform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.fsoft.template.model.User;
import com.fsoft.template.request.LoginRequest;
import com.fsoft.template.request.UserRegistryRequest;

@MessageEndpoint
public class UserTransformer {
  
  @Autowired
  private PasswordEncoder passwordEncoder;

  @ServiceActivator(inputChannel = "user-registry-channel-2-transform", outputChannel = "user-registry-channel-3-validate-storage")
  public User fromRequest(UserRegistryRequest request) {
    User user = new User();
    
    user.setUsername(request.getUsername());
    user.setPassword(passwordEncoder.encode(request.getPassword()).toString());
    
    user.setEmail(request.getEmail());
    user.setFullname(request.getFullname());
    user.setPhone(request.getPhone());
    
    user.setCreationDate(System.currentTimeMillis());
    user.setCreationDate(System.currentTimeMillis());
   
    user.setStatus(User.NONE);
    
    return user;
  }
  
  @ServiceActivator(inputChannel = "login-channel-2-transform", outputChannel = "login-channel-3-validate-storage")
  public User login(LoginRequest request) {
    User user = new User();
    
    user.setUsername(request.getUsername());
    user.setPassword(passwordEncoder.encode(request.getPassword()).toString());
    
    return user;
  }
  
}
