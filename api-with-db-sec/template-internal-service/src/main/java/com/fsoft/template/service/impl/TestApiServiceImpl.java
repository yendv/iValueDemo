/**
 * 
 */
package com.fsoft.template.service.impl;

import java.util.List;
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
public class TestApiServiceImpl extends AbstractServiceImpl<TestApi, Long, TestApiRespository>
		implements TestApiService {

	@ServiceActivator(inputChannel = "test-api-registry-channel-4-service", outputChannel = "test-api-registry-channel-5-result")
	public TestApi saveTestApi(TestApi testApi) {
		return repo.save(testApi);
	}

	@ServiceActivator(inputChannel = "test-api-list-all", outputChannel = "test-api-list-all-result")
	public List<TestApi> list(String filter) {
		// co the loc o day
		return repo.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.fsoft.template.service.TestApiService#get(java.lang.String)
	 */
	@Override
	public Optional<TestApi> get(String name) {
		TestApi model = repo.findByName(name);
		return Optional.ofNullable(model);
	}
}
