/**
 * 
 */
package com.fsoft.template.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fsoft.template.model.Coupon;
import com.fsoft.template.model.CouponPK;

/**
 * @author YenDV
 *
 */
public interface CouponRepository extends JpaRepository<Coupon, CouponPK> {
	@Transactional
	@Modifying
	@Query("UPDATE Coupon " + 
			"SET orderId = :orderId , mdfId = :mdfId " + 
			 "WHERE id.cpnId = :id" 
				
			)
	public Integer orderBasicUpdateQuery(
			@Param("orderId") String orderId , @Param("mdfId") String mdfId,
			@Param("id") String id);
	
}
