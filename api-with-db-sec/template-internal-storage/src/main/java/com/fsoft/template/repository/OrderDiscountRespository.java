package com.fsoft.template.repository;

import java.math.BigDecimal;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fsoft.template.model.OrderDiscount;
import com.fsoft.template.model.OrderDiscountPK;

public interface OrderDiscountRespository extends JpaRepository<OrderDiscount, OrderDiscountPK> {
	@Transactional
	@Modifying
	@Query("SELECT COUNT(*) " + 
			" FROM OrderDiscount  " + 
			" WHERE id.ordId = :in_ord_id " + 
			" AND id.ordSeq = :ord_seq")
	public BigDecimal countById(@Param("in_ord_id") String in_ord_id, 
			@Param("ord_seq") String ord_seq);
}
