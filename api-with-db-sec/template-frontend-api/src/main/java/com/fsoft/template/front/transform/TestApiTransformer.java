/**
 * 
 */
package com.fsoft.template.front.transform;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.fsoft.template.model.TestApi;
import com.fsoft.template.request.TestApiRequest;
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;


/**
 * @author YenDV
 *
 */
@MessageEndpoint
public class TestApiTransformer {
	
	
	@ServiceActivator(inputChannel="test-api-registry-channel-2-transform", 
			outputChannel = "test-api-registry-channel-3-validate-storage")
	public TestApi transformer(TestApiRequest request){
		TestApi result = new TestApi();
		//result.setId(request.getId() == null ? 1 : request.getId());
		result.setName(request.getName());
		result.setAge(request.getAge());
		return result;
	}
	
	@ServiceActivator(inputChannel="test-api-get-all-transform")
	public String transformer(List<TestApi> tests){
		String resul = "";//(tests == null || tests.isEmpty()) ? "" : new Gson().toJson(tests);
		return resul;
	}
}
