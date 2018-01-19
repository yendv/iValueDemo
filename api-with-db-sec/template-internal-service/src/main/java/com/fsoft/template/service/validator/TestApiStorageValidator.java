/**
 * 
 */
package com.fsoft.template.service.validator;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

import com.fsoft.template.exception.CommonException;
import com.fsoft.template.model.TestApi;
import com.fsoft.template.repository.exception.RepositoryException;
import com.fsoft.template.service.TestApiService;

/**
 * @author YenDV
 *
 */
@MessageEndpoint
public class TestApiStorageValidator {
	@Autowired 
	private TestApiService testService;
	
	
	@ServiceActivator(inputChannel = "test-api-registry-channel-3-validate-storage",
			outputChannel = "test-api-registry-channel-4-service")
	public TestApi validate(TestApi testApi) throws CommonException{
		Optional<TestApi> optinal = testService.get(testApi.getId());
		//check exist
		if(optinal.isPresent()){
			throw new RepositoryException(RepositoryException.DUPLICATED_ERROR,
					RepositoryException.DUPLICATED_ERROR_DESCRIPTION);
		}
		return testApi;
	}
	
}
