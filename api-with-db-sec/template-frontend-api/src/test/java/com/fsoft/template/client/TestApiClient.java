/*package com.fsoft.template.client;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.fsoft.template.request.TestApiRequest;
import com.fsoft.template.response.TemplateResponse;
import com.fsoft.template.response.TestApiResponse;

public class TestApiClient {

	public static void main(String[] args) throws RestClientException, URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders httpHeaders = new HttpHeaders();

		String url = "http://localhost:8080/testapi/save";

		TestApiRequest request = new TestApiRequest();
		request.setAge("12");
		request.setName("test23");
		//
		// HttpEntity<TestApiRequest> entityWithBody = new HttpEntity<>(request,
		// httpHeaders);
		// ResponseEntity<String> response = restTemplate.exchange(url,
		// HttpMethod.POST, entityWithBody, String.class);
		// System.out.println(response.getBody());

		url = "http://localhost:8080/testapi/list";

		// TypeReference<List<TestApiResponse>> reference = new
		// TypeReference<List<TestApiResponse>>() {
		// };

		HttpHeaders headers = new HttpHeaders();
		headers.set("User-Agent", "Firefox");
		// headers.set("X-Forwarded-For", "127.0.0.1");
		HttpEntity<Object> entity = new HttpEntity<Object>(headers);

		ResponseEntity<String> response2 = restTemplate.exchange(new URI(url), HttpMethod.GET, entity, String.class);
		System.out.println(response2.getBody());

		ParameterizedTypeReference<TemplateResponse<List<TestApiResponse>>> reference = new ParameterizedTypeReference<TemplateResponse<List<TestApiResponse>>>() {
		};

		ResponseEntity<TemplateResponse<List<TestApiResponse>>> response = restTemplate.exchange(new URI(url),
				HttpMethod.GET, entity, reference);
		System.out.println(response.getBody().getData());

		//
		//
		// //response = restTemplate.exchange(url, HttpMethod.POST, null,
		// String.class);
		// System.out.println(response.getBody());
	}
}
*/