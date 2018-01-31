/**
 * 
 */
package com.fsoft.template.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.repository.query.Param;

import com.fsoft.template.model.OrderBasic;
import com.fsoft.template.model.OrderDetail;

/**
 * @author YenDV
 *
 */
public interface OrderDetailsService {
	public List<OrderDetail> getByOrdId(String ordId);
	
	public Integer updateById(BigDecimal ln_rtn_pss_dur,String gf_ord_id,
			String gf_ord_seq);
	
	public List<OrderDetail> getByOrdIdOrderId(String in_ord_id);
	
	public List<OrderDetail> getSeqApYnByOrdIdOrderId(String in_ord_id);
}
