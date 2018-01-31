/**
 * 
 */
package com.fsoft.template.service.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessageEndpoint;

import com.fsoft.template.repository.OrderDiscountRespository;
import com.fsoft.template.service.OrderDiscountService;

/**
 * @author YenDV
 *
 */
@MessageEndpoint
public class OrderDiscountServiceImpl implements OrderDiscountService {
	@Autowired
	OrderDiscountRespository repo;
	
	@Override
	public BigDecimal countById(String in_ord_id, String ord_seq) {
		return repo.countById(in_ord_id, ord_seq);
	}
	
}
