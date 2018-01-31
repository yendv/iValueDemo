/**
 * 
 */
package com.fsoft.template.service.impl;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.integration.annotation.MessageEndpoint;

import com.fsoft.template.repository.CouponRepository;
import com.fsoft.template.service.CouponService;

/**
 * @author YenDV
 *
 */

@MessageEndpoint
public class CouponServiceImpl implements CouponService {
	final static Logger logger = LoggerFactory.getLogger(CouponServiceImpl.class);
	
	@Autowired
	protected Environment env;
	@Autowired
	private CouponRepository repo;
	
	
	public Integer orderBasicUpdateQuery(String in_cst_id, String in_ord_id, java.util.Date in_inst_dtm,
			String in_mdf_id, java.util.Date in_mdf_dtm, String in_dlvf_dsn_cpn_id, String in_dlvf_dsn_cpn_no) {
		try {
			System.out.println("in_cst_id " + in_cst_id);
			/*logger.info(repo.orderBasicUpdateQueryTest(
					"000000000000000",
					in_ord_id,
					in_mdf_id, 
					in_dlvf_dsn_cpn_id,
					in_dlvf_dsn_cpn_no).toString());*/
			return repo.orderBasicUpdateQuery(in_cst_id,
					in_ord_id,
					in_inst_dtm,
					in_mdf_id, 
					in_mdf_dtm,
					in_dlvf_dsn_cpn_id,
					in_dlvf_dsn_cpn_no);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
