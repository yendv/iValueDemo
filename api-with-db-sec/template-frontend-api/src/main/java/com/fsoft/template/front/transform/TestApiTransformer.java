/**
 * 
 */
package com.fsoft.template.front.transform;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

import com.fsoft.template.model.TestApi;
import com.fsoft.template.request.TestApiRequest;
import com.fsoft.template.response.TestApiResponse;

/**
 * @author YenDV
 *
 */
@MessageEndpoint
public class TestApiTransformer {

	@ServiceActivator(inputChannel = "test-api-registry-channel-2-transform", 
			outputChannel = "test-api-registry-channel-3-validate-storage")
	public TestApi transformer(TestApiRequest request) {
		TestApi result = new TestApi();
		result.setName(request.getName());
		result.setAge(request.getAge());
		return result;
	}

	@ServiceActivator(inputChannel = "test-api-registry-channel-5-result")
	public String toResult(TestApi api) {
		return api.getId().toString();
	}

	@ServiceActivator(inputChannel = "test-api-list-all-result")
	public List<TestApiResponse> toResult(List<TestApi> list) {
		return list.parallelStream().map(api -> new TestApiResponse(api.getId(), api.getName(), api.getAge()))
				.collect(Collectors.toList());
	}
}
