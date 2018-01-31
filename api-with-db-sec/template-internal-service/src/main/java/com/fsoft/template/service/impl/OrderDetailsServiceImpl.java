/**
 * 
 */
package com.fsoft.template.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.util.StringUtils;

import com.fsoft.template.model.OrderBasic;
import com.fsoft.template.model.OrderDetail;
import com.fsoft.template.model.OrderDetailPK;
import com.fsoft.template.repository.OrderDetailReponsitory;
import com.fsoft.template.service.OrderDetailsService;
import com.fsoft.template.util.GenericValidate;

/**
 * @author YenDV
 *
 */
@MessageEndpoint
public class OrderDetailsServiceImpl implements OrderDetailsService {
	@Autowired
	OrderDetailReponsitory repo;
	
	@Override
	public List<OrderDetail> getByOrdId(String ordId) {
		List<Object[]> results = repo.getByOrdId(ordId);
		List<OrderDetail> ordDtls = new ArrayList<OrderDetail>();
		if(results != null && !results.isEmpty()){
			results.forEach(val->{
				OrderDetail ordDtl = new OrderDetail();
				OrderDetailPK pk = new OrderDetailPK();
				if(!StringUtils.isEmpty(val[0]))pk.setOrdId(val[0].toString());
				if(!StringUtils.isEmpty(val[1]))pk.setOrdSeq(val[1].toString());
				if(!StringUtils.isEmpty(val[2])) ordDtl.setGfYn(val[2].toString());
				ordDtl.setId(pk);
				ordDtls.add(ordDtl);
			});
		}
		return ordDtls;
	}

	@Override
	public Integer updateById(BigDecimal ln_rtn_pss_dur,String gf_ord_id,
			String gf_ord_seq) {
		return repo.updateById(ln_rtn_pss_dur, gf_ord_id, gf_ord_seq);
	}
	
	@Override
	public List<OrderDetail> getByOrdIdOrderId(String in_ord_id) {
		List<OrderDetail> odBasics = new ArrayList<OrderDetail>();
		List<Object[]> objs = repo.getByOrdIdOrderId(in_ord_id);
		if(objs != null && !objs.isEmpty()){
			objs.forEach(obj->{
				OrderDetail od = new OrderDetail();
				OrderDetailPK odPK = new OrderDetailPK();
				
				if(obj[0] != null) odPK.setOrdSeq(obj[0].toString());
				if(obj[1] != null) od.setPnApYn(obj[1].toString());
				if(obj[2] != null && GenericValidate.validateBigDecimal(obj[2].toString().trim())) 
					od.setPnOtkArrAmt(new BigDecimal(obj[2].toString().trim()));
				od.setId(odPK);
				odBasics.add(od);
			});
		}
		return odBasics;
	}

	@Override
	public List<OrderDetail> getSeqApYnByOrdIdOrderId(String in_ord_id) {
		List<OrderDetail> odBasics = new ArrayList<OrderDetail>();
		List<Object[]> objs = repo.getSeqApYnByOrdIdOrderId(in_ord_id);
		if(objs != null && !objs.isEmpty()){
			objs.forEach(obj->{
				OrderDetail od = new OrderDetail();
				OrderDetailPK odPK = new OrderDetailPK();
				if(obj[0] != null) odPK.setOrdSeq(obj[0].toString());
				if(obj[1] != null) od.setDsnApYn(obj[1].toString());
				odBasics.add(od);
			});
		}
		return odBasics;
	}
}
