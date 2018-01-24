/**
 * 
 */
package com.fsoft.template.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.util.StringUtils;

import com.fsoft.template.model.Coupon;
import com.fsoft.template.model.OrderBasic;
import com.fsoft.template.repository.CouponRepository;
import com.fsoft.template.repository.OrderBasicReponsitory;
import com.fsoft.template.service.OrderBasicInformationService;

/**
 * @author YenDV
 *
 */
@MessageEndpoint
public class OrderBasicInformationServiceImpl extends AbstractServiceImpl<OrderBasic, String, OrderBasicReponsitory>
	implements OrderBasicInformationService{
	
	@ServiceActivator(inputChannel = "rOrdBsPc-update-channel-3-service" ,
			outputChannel = "rOrdBsPc-update-channel-4-validate-storage")
	public String updateBasicInfomation(OrderBasic orderBasic) {
		if(!StringUtils.isEmpty(orderBasic.getDlvfDsnCpnId())){
			Coupon c = new Coupon();
			
			//couponRespository.save(arg0);
		}
		return null;
	}

}
