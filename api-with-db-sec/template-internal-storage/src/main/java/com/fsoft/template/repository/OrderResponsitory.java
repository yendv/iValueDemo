package com.fsoft.template.repository;

import java.math.BigDecimal;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fsoft.template.model.Order;
import com.fsoft.template.model.OrderPK;

public interface OrderResponsitory extends JpaRepository<Order, OrderPK>{
	@Transactional
	@Modifying
	@Query("SELECT COUNT(*) " + 
			"	FROM Order a " + 
			"WHERE a.id.ordId = :in_ord_id " + 
			"	AND a.id.ordSeq = '000' " + 
			"	AND a.pnRsnRltdId = :lv_amt_pn_pmt_id")
	public BigDecimal getCountByIdAndPnRsnRltdId(@Param("in_ord_id") String in_ord_id , 
			@Param("lv_amt_pn_pmt_id") String lv_amt_pn_pmt_id);
	
	@Transactional
	@Modifying
	@Query("SELECT COUNT(*) " + 
			" FROM Order " + 
			" WHERE id.ordId = :in_ord_id " + 
			" AND id.ordSeq = :ord_Seq")
	public BigDecimal countById(@Param("in_ord_id") String in_ord_id, 
			@Param("ord_Seq") String ord_Seq);
}
