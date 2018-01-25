/**
 * 
 */
package com.fsoft.template.front.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fsoft.template.exception.CommonException;
import com.fsoft.template.front.gateway.TestApiGateway;
import com.fsoft.template.request.TestApiRequest;
import com.fsoft.template.response.TemplateResponse;
import com.fsoft.template.response.TestApiResponse;

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
	@RequestMapping(name = "/testapi/list" , method = RequestMethod.GET)
	public @ResponseBody TemplateResponse<List<TestApiResponse>> getAll(@RequestParam (required = false) String filter) {
		return toResult(gateway.getAll(org.springframework.util.StringUtils.isEmpty(filter) ? "all" : filter));
	}
}