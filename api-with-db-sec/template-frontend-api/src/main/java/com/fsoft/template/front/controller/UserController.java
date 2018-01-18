
package com.fsoft.template.front.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fsoft.template.exception.CommonException;
import com.fsoft.template.front.gateway.AccountGateway;
import com.fsoft.template.request.LoginRequest;
import com.fsoft.template.request.UserRegistryRequest;
import com.fsoft.template.response.TemplateResponse;

/**
 * Author : Thuan.Nhu Oct 27, 2017
 */
@RestController()
public class UserController extends AbstractController<AccountGateway> {

	@PostMapping("/user/registry")
	public @ResponseBody TemplateResponse<String> registry(@RequestBody UserRegistryRequest request) {
		try {
			return toResult(gateway.registry(request));
		} catch (CommonException exp) {
			return toResult(exp);
		}
	}

	@PostMapping("/user/login")
	public @ResponseBody TemplateResponse<String> login(@RequestBody LoginRequest request) {
		try {
			return toResult(gateway.login(request));
		} catch (CommonException exp) {
			return toResult(exp);
		}
	}
}
