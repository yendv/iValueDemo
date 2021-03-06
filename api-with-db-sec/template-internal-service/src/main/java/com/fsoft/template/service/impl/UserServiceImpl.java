
package com.fsoft.template.service.impl;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

import com.fsoft.template.model.User;
import com.fsoft.template.repository.UserRepository;
import com.fsoft.template.service.UserService;

/**
 * Author : Thuan.Nhu Oct 27, 2017
 */
@MessageEndpoint
public class UserServiceImpl extends AbstractServiceImpl<User, String, UserRepository> implements UserService {

	//@ServiceActivator(inputChannel = "user-registry-channel-4-service")
	public String registryUser(User user) {
		//repo.save(user);
		repo.updatetest(user.getPhone(), user.getUsername());
		return user.getPhone();
	}

	@ServiceActivator(inputChannel = "login-channel-4-service")
	public String login(User user) {
		return "ROLE_USER";
	}
}
