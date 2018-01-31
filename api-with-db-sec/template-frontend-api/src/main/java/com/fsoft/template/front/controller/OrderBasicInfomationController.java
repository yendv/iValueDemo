
package com.fsoft.template.front.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fsoft.template.exception.CommonException;
import com.fsoft.template.front.gateway.OrderBasicInfomationGateway;
import com.fsoft.template.front.gateway.TestApiGateway;
import com.fsoft.template.request.OrderBasicInfomationRequest;
import com.fsoft.template.response.ResponseCode;
import com.fsoft.template.response.TemplateResponse;


@CrossOrigin(origins = "http://localhost", maxAge = 3600)
@RestController()
public class OrderBasicInfomationController {
	@Autowired
	OrderBasicInfomationGateway gateway;
	
	@PostMapping("/orderbsi/update")
	public  ResponseEntity<String> update(@RequestBody OrderBasicInfomationRequest request){
		try {
			/*TemplateResponse<String> response = new TemplateResponse<String>();
		    response.setCode(ResponseCode.SUCCESS);
		    response.setDescription(ResponseCode.SUCCESS_DESCRIPTION);
		    response.setData(gateway.registryOrderBasicProcessing(request));*/
		    return new ResponseEntity<String>(gateway.registryOrderBasicProcessing(request),
		    		HttpStatus.OK);
		} catch (CommonException exp) {
			String messsage = "";
			
			messsage = "{\"code\" : \""
					+ exp.getCode()
					+ "\", \"message\" "
					+ "\""
					+ exp.getMessage()
					+ "\"}";
			return new ResponseEntity<String>(messsage,
		    		HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
