/**
 * 
 */
package com.fsoft.template.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsoft.template.model.Coupon;
import com.fsoft.template.model.OrderBasic;

/**
 * @author YenDV
 *
 */
public interface OrderBasicReponsitory extends JpaRepository<OrderBasic, String>{

}
