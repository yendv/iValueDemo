/**
 * 
 */
package com.fsoft.template.front.gateway;

import java.util.List;

import com.fsoft.template.exception.CommonException;
import com.fsoft.template.request.TestApiRequest;
import com.fsoft.template.response.TestApiResponse;

/**
 * @author YenDV
 *
 */
public interface TestApiGateway {
  
	public String save(TestApiRequest request) throws CommonException;
	
	public List<TestApiResponse> getAll(String filter);
}
