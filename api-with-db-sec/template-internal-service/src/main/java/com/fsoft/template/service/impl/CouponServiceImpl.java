/**
 * 
 */
package com.fsoft.template.service.impl;


import java.sql.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.integration.annotation.MessageEndpoint;

import com.fsoft.template.model.Coupon;
import com.fsoft.template.repository.CouponRepository;
import com.fsoft.template.service.CouponService;
import com.fsoft.template.service.TemplateServiceTest;

/**
 * @author YenDV
 *
 */

@MessageEndpoint
public class CouponServiceImpl 
	implements CouponService {
	final static Logger logger = LoggerFactory.getLogger(CouponServiceImpl.class);
	
	@Autowired
	protected Environment env;
	@Autowired
	CouponRepository repo;
	
	public Integer orderBasicUpdateQuery(String customerId, String orderId, Date orderDate, String mdfId, String mdfDtm,
			String couponIssueNumber) {
		System.err.println("mdfId " + mdfId);
		System.err.println("id " + customerId);
		logger.info(repo.orderBasicUpdateQuery(orderId, mdfId ,customerId).toString());
		return null;
	}
	
}
