/**
 * 
 */
package com.fsoft.template.front.gateway;

import com.fsoft.template.exception.CommonException;
import com.fsoft.template.request.TestApiRequest;

/**
 * @author YenDV
 *
 */
public interface TestApiGateway {
	public String save(TestApiRequest request) throws CommonException;
	
	public String getAll();
}
