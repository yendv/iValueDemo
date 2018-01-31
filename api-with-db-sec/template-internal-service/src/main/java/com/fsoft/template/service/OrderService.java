/**
 * 
 */
package com.fsoft.template.service;

import java.math.BigDecimal;



/**
 * @author YenDV
 *
 */
public interface OrderService {
	public BigDecimal getCountByIdAndPnRsnRltdId(String in_ord_id, String lv_amt_pn_pmt_id);
	
	public BigDecimal countById(String in_ord_id,  String ord_Seq);
}
