/**
 * 
 */
package com.fsoft.template.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.util.StringUtils;

import com.fsoft.template.model.Coupon;
import com.fsoft.template.model.OrderBasic;
import com.fsoft.template.repository.CouponRepository;
import com.fsoft.template.repository.OrderBasicReponsitory;
import com.fsoft.template.service.OrderBasicService;
import com.fsoft.template.util.GenericValidate;

/**
 * @author YenDV
 *
 */
@MessageEndpoint
public class OrderBasicServiceImpl extends AbstractServiceImpl<OrderBasic, String, OrderBasicReponsitory>
	implements OrderBasicService{
	@Autowired
	private OrderBasicReponsitory repo;
	
	@Override
	public List<OrderBasic> getByOrdId(String in_ord_id) {
		List<OrderBasic> odBasics = new ArrayList<OrderBasic>();
		List<Object[]> objs = repo.getByOrdId(in_ord_id);
		if(objs != null && !objs.isEmpty()){
			objs.forEach(obj->{
				OrderBasic od = new OrderBasic();
				if(obj[0] != null) od.setAmtPnApYn(obj[0].toString());
				if(obj[1] != null) od.setAmtPnPmtId(obj[1].toString());
				if(obj[2] != null && GenericValidate.validateBigDecimal(obj[2].toString().trim())) 
					od.setAmtPnOtkArrAmt(new BigDecimal(obj[2].toString().trim()));
				odBasics.add(od);
			});
		}
		return odBasics;
	}
	
	@Override
	public String saveOrderBasic(OrderBasic ordBsc){
		String result = "00000";
		try {
			repo.save(ordBsc);
		} catch (Exception e) {
			e.printStackTrace();
			result = null;
		}
		return result;
	}
}
