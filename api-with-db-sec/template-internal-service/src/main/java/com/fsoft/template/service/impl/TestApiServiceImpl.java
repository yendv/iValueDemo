/**
 * 
 */
package com.fsoft.template.service.impl;

import java.util.Optional;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

import com.fsoft.template.model.TestApi;
import com.fsoft.template.repository.TestApiRespository;
import com.fsoft.template.service.TestApiService;

/**
 * @author YenDV
 *
 */
@MessageEndpoint
public class TestApiServiceImpl extends AbstractServiceImpl<TestApi, String, TestApiRespository>
								implements TestApiService {
	@ServiceActivator(inputChannel = "test-api-registry-channel-4-service")
	public TestApi saveTestApi(TestApi testApi){
		repo.save(testApi);
		return testApi;
	}
	
	
}
