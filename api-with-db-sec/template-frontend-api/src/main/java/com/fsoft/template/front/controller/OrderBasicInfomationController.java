/*
package com.fsoft.template.front.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fsoft.template.exception.CommonException;
import com.fsoft.template.front.gateway.OrderBasicInfomationGateway;
import com.fsoft.template.request.OrderBasicInfomationRequest;
import com.fsoft.template.response.TemplateResponse;


@RestController()
public class OrderBasicInfomationController extends AbstractController<OrderBasicInfomationGateway>{
	
	@PostMapping("orderbsi/update")
	public @ResponseBody TemplateResponse<String> update(@RequestBody OrderBasicInfomationRequest request){
		try {
			return toResult(gateway.registryOrderBasicProcessing(request));
		} catch (CommonException exp) {
			return toResult(exp);
		}
	}
}
*/