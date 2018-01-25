/**
 * 
 */
package com.fsoft.template.repository;

import javax.persistence.Temporal;
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
	/*@Transactional
	@Modifying
	@Query("UPDATE Coupon " + 
			"SET orderId = :orderId , mdfId = :mdfId " + 
			 "WHERE id.cpnId = :id"
			)
	public Integer orderBasicUpdateQuery(
			@Param("orderId") String orderId , @Param("mdfId") String mdfId,
			@Param("id") String id);*/
	
	@Transactional
	@Modifying
	@Query("UPDATE Coupon " + 
			"SET " + 
			"customerId = (CASE WHEN cpnCstInstTpCd = '10' THEN customerId ELSE :in_cst_id END), " + 
			"cpnUseYn = 'Y', " + 
			"orderId = :in_ord_id, " + 
			//"orderDate = :in_inst_dtm, " + 
			"mdfId = :in_mdf_id, " + 
			"mdfDtm = :in_mdf_dtm " + 
			"WHERE id.cpnId = :in_dlvf_dsn_cpn_id "
			+ "AND isdCpnPrtNo = :in_dlvf_dsn_cpn_no\r\n" + 
			"	AND SYSDATE BETWEEN cpnVldDurBgnDtm AND cpnVldDurClDtm\r\n" + 
			"	AND USE_YN = 'Y'\r\n" + 
			"	AND NVL(customerId, '0') = (CASE WHEN cpnCstInstTpCd = '10' THEN :in_cst_id ELSE NVL(customerId, '0') END)\r\n" + 
			"	AND NVL(cpnUseYn, 'N') = 'N'"
			)
	public Integer orderBasicUpdateQuery(
			@Param("in_cst_id") String in_cst_id ,
			@Param("in_ord_id") String in_ord_id,
			@Param("in_mdf_id") String in_mdf_id,
			@Param("in_mdf_dtm")java.util.Date in_mdf_dtm,
			@Param("in_dlvf_dsn_cpn_id") String in_dlvf_dsn_cpn_id,
			@Param("in_dlvf_dsn_cpn_no") String in_dlvf_dsn_cpn_no);
	
}
