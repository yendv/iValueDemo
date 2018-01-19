/**
 * 
 */
package com.fsoft.template.front.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fsoft.template.exception.CommonException;
import com.fsoft.template.front.gateway.TestApiGateway;
import com.fsoft.template.request.TestApiRequest;
import com.fsoft.template.response.TemplateResponse;

/**
 * @author YenDV
 *
 */
@RestController()
public class TestApiRestController extends AbstractController<TestApiGateway> {
	@PostMapping("/testapi/save")
	public @ResponseBody TemplateResponse<String> save(@RequestBody TestApiRequest testRequest){
		try {
			return toResult(gateway.save(testRequest));
		} catch (CommonException exp) {
			return toResult(exp);
		}
	}
	
	//@GetMapping("/testapi/getall")
	@RequestMapping(name = "/testapi/getall" , method = RequestMethod.GET)
	public @ResponseBody TemplateResponse<String> getAll(){
		return toResult(gateway.getAll());
	}
}