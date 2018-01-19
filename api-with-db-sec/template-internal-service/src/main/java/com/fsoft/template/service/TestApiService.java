/**
 * 
 */
package com.fsoft.template.service;

import java.util.Optional;

import com.fsoft.template.model.TestApi;

/**
 * @author YenDV
 *
 */
public interface TestApiService {
	public Optional<TestApi> get(Long id);
	
	public TestApi saveTestApi(TestApi testApi);
	
	
}
