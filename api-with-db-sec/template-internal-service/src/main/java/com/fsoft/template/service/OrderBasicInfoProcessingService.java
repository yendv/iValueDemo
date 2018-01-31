package com.fsoft.template.service;

import com.fsoft.template.exception.CommonException;
import com.fsoft.template.model.OrderBasic;

public interface OrderBasicInfoProcessingService  {
	public String processing(OrderBasic request) throws CommonException;
}
