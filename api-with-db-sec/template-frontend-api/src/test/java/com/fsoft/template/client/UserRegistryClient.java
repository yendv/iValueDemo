/***************************************************************************
 * Copyright 2016 by fsoft - All rights reserved.                *    
 **************************************************************************//*
package com.fsoft.template.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fsoft.template.request.TestApiRequest;

*//**
 * Author : Nhu Dinh Thuan Email:nhudinhthuan@gmail.com Nov 15, 2017
 *//*
public class UserRegistryClient {

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders httpHeaders = new HttpHeaders();

		String url = "http://localhost:8080/testapi/save";

		// UserRegistryRequest request = new UserRegistryRequest();
		// request.setUsername("test111");
		// request.setPassword("123456");
		// request.setRePassword("123456");
		// request.setEmail("vana@gmail.com");
		// request.setFullname("Nguyen Van A");

		TestApiRequest request = new TestApiRequest();
		request.setAge("12");
		request.setName("test23");
		//
		HttpEntity<TestApiRequest> entityWithBody = new HttpEntity<>(request, httpHeaders);
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entityWithBody, String.class);
		System.out.println(response.getBody());

		// response = restTemplate.exchange(url, HttpMethod.POST,
		// entityWithBody, String.class);
		// System.out.println(response.getBody());

		// HttpEntity<TestApiRequest> entityWithBody = new HttpEntity<>(request,
		// httpHeaders);

		// ResponseEntity<String> response = restTemplate.exchange(url,
		// HttpMethod.GET, null, String.class);
		// System.out.println(response.getBody());
		//
		//
		// //response = restTemplate.exchange(url, HttpMethod.POST, null,
		// String.class);
		// System.out.println(response.getBody());
	}
}
*/