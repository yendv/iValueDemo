/**
 * 
 */
package com.fsoft.template.front.validator;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.util.StringUtils;

import com.fsoft.template.exception.CommonException;
import com.fsoft.template.request.TestApiRequest;
import com.fsoft.template.response.ResponseCode;


/**
 * @author YenDV
 *
 */
@MessageEndpoint
public class TestApiInputValidator {
	@ServiceActivator(inputChannel="test-api-registry-channel-1-validate-input",
			outputChannel="test-api-registry-channel-2-transform")
	public TestApiRequest validate(TestApiRequest request) throws CommonException{
		if(StringUtils.isEmpty(request.getName()) || request.getName().equals("test_api")){
			throw new CommonException(ResponseCode.EMPTY_DATA_ERROR, "username", ResponseCode.EMPTY_DATA_ERROR_DESCRIPTION);
		}
		return request;
	}
}
