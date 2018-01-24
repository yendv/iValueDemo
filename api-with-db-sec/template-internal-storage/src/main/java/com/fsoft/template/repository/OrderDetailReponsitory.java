/**
 * 
 */
package com.fsoft.template.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fsoft.template.model.Coupon;
import com.fsoft.template.model.OrderDetail;

/**
 * @author YenDV
 *
 */
public interface OrderDetailReponsitory extends JpaRepository<OrderDetail, String>{
	
}
