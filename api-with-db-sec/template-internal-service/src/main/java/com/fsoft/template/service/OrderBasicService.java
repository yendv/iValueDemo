/**
 * 
 */
package com.fsoft.template.service;

import java.math.BigDecimal;
import java.util.List;

import com.fsoft.template.model.OrderBasic;

/**
 * @author YenDV
 *
 */
public interface OrderBasicService {
	public List<OrderBasic> getByOrdId(String in_ord_id);
	
	public String saveOrderBasic(OrderBasic ordBsc);
}
