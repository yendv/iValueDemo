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

import com.fsoft.template.model.OrderDetail;
import com.fsoft.template.model.OrderDetailPK;

/**
 * @author YenDV
 *
 */
public interface OrderDetailReponsitory extends JpaRepository<OrderDetail, OrderDetailPK>{
	@Transactional
	@Modifying
	@Query("SELECT id.ordId ," + 
			"	id.ordSeq ," + 
			"	NVL(gfYn, 'N') " + 
			" FROM OrderDetail " + 
			" WHERE id.ordId = :in_ord_id " + 
			" AND NVL(gfYn, 'N') = 'Y' " + 
			" ORDER BY id.ordSeq")
	public List<Object[]> getByOrdId(@Param("in_ord_id") String in_ord_id);
	
	@Transactional
	@Modifying
	@Query("UPDATE OrderDetail " + 
			"	SET rtnPssDur = :ln_rtn_pss_dur " + 
			"WHERE id.ordId = :gf_ord_id " + 
			"	AND id.ordSeq = :gf_ord_seq")
	public Integer updateById(@Param("ln_rtn_pss_dur") BigDecimal ln_rtn_pss_dur,
			@Param("gf_ord_id") String gf_ord_id,
			@Param("gf_ord_seq") String gf_ord_seq);
	
	@Transactional
	@Modifying
	@Query("SELECT a.id.ordSeq, " + 
			"		a.pnApYn, " + 
			"		a.pnOtkArrAmt " + 
			"FROM OrderDetail a " + 
			"WHERE a.id.ordId = :in_ord_id " + 
			"ORDER BY a.id.ordId , a.id.ordSeq")
	public List<Object[]> getByOrdIdOrderId(@Param("in_ord_id") String in_ord_id);
	
	@Transactional
	@Modifying
	@Query("SELECT  a.id.ordSeq, " + 
			"		a.dsnApYn " + 
			"FROM OrderDetail a " + 
			"WHERE a.id.ordId = :in_ord_id " + 
			"ORDER BY a.id.ordId , a.id.ordSeq")
	public List<Object[]> getSeqApYnByOrdIdOrderId(@Param("in_ord_id") String in_ord_id);
}
