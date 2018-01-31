/**
 * 
 */
package com.fsoft.template.service.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessageEndpoint;

import com.fsoft.template.repository.OrderResponsitory;
import com.fsoft.template.service.OrderService;

/**
 * @author YenDV
 *
 */
@MessageEndpoint
public class OrderServiceImpl implements OrderService {
	@Autowired 
	OrderResponsitory repo;
	
	@Override
	public BigDecimal getCountByIdAndPnRsnRltdId(String in_ord_id, String lv_amt_pn_pmt_id) {
		return repo.getCountByIdAndPnRsnRltdId(in_ord_id, lv_amt_pn_pmt_id);
	}

	@Override
	public BigDecimal countById(String in_ord_id, String ord_Seq) {
		return repo.countById(in_ord_id, ord_Seq);
	}
}
