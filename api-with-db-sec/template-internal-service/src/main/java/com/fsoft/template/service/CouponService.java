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
	public Integer orderBasicUpdateQuery(String in_cst_id, 
			String in_ord_id , String in_mdf_id, 
			java.util.Date in_mdf_dtm , String in_dlvf_dsn_cpn_id,
			String in_dlvf_dsn_cpn_no);
}
