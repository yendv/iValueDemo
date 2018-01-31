/**
 * 
 */
package com.fsoft.template.service;

import java.math.BigDecimal;


/**
 * @author YenDV
 *
 */
public interface OrderDiscountService {
	public BigDecimal countById(String in_ord_id, String ord_seq);
}
