/**
 * 
 */
package com.fsoft.template.service;


import com.fsoft.template.model.Coupon;

/**
 * @author YenDV
 *
 */
public interface CouponService {
	public Integer orderBasicUpdateQuery(String customerId, 
			String orderId , java.sql.Date orderDate, 
			String mdfId , String mdfDtm,
			String couponIssueNumber);
}
