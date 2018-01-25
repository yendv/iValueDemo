/**
 * 
 */
package com.fsoft.template.front.validator;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

import com.fsoft.template.exception.CommonException;
import com.fsoft.template.request.OrderBasicInfomationRequest;
import com.fsoft.template.response.ResponseCode;
import com.fsoft.template.util.GenericValidate;

/**
 * @author YenDV
 *
 */
@MessageEndpoint
public class OrderBasicInfomationValidator {
	@ServiceActivator(inputChannel = "rOrdBsPc-update-channel-1-validate-input" , 
			outputChannel = "rOrdBsPc-update-channel-2-transform")
	public OrderBasicInfomationRequest validate(OrderBasicInfomationRequest request) throws CommonException{
		if(request.getIn_pstm_rmtr() != null && 
				!GenericValidate.validateDate(request.getIn_pstm_rmtr())){
			throw new CommonException(ResponseCode.TYPE_DATA_ERROR, 
					"order-date", ResponseCode.TYPE_DATA_ERROR_DESCRIPTION);
		}
		return request;
	}
}
