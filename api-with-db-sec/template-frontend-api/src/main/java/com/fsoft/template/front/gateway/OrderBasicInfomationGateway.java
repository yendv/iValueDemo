/**
 * 
 */
package com.fsoft.template.front.gateway;

import com.fsoft.template.exception.CommonException;
import com.fsoft.template.request.OrderBasicInfomationRequest;

/**
 * @author YenDV
 *
 */
public interface OrderBasicInfomationGateway {
	public String registryOrderBasicProcessing(OrderBasicInfomationRequest request) throws CommonException;
}
