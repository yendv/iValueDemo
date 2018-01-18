/**
 * 
 */
package com.fsoft.template.service.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessageEndpoint;

import com.fsoft.template.service.TestApiService;

/**
 * @author YenDV
 *
 */
@MessageEndpoint
public class TestApiStorageValidator {
	@Autowired 
	private TestApiService testService;
	
	
}
