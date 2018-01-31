/**
 * 
 */
package com.fsoft.template.repository;

import java.math.BigDecimal;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fsoft.template.model.OrderBasic;

/**
 * @author YenDV
 *
 */
public interface OrderBasicReponsitory extends JpaRepository<OrderBasic, String>{
	@Transactional
	@Modifying
	@Query("SELECT  a.amtPnApYn, " + 
			"		a.amtPnPmtId, " + 
			"		a.amtPnOtkArrAmt " + 
			"FROM OrderBasic a " + 
			"WHERE a.ordId = :in_ord_id")
	public List<Object[]> getByOrdId(@Param("in_ord_id") String in_ord_id);
	
}
