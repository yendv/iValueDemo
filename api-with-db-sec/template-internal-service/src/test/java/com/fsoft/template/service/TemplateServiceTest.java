/***************************************************************************
 * Copyright 2016 by HomeDirect - All rights reserved.                *    
 **************************************************************************/
package com.fsoft.template.service;

import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.fsoft.template.model.OrderBasic;

/**
 * Author : Nhu Dinh Thuan Email:thuan.nhu@homedirect.com.vn Jan 18, 2018
 */

/*@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@SpringBootApplication
@ImportResource("classpath:application-config.xml")
@PropertySource("classpath:application.properties")
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class, JpaRepositoriesAutoConfiguration.class,
		HibernateJpaAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class,
		org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class })
public class TemplateServiceTest {

	final static Logger logger = LoggerFactory.getLogger(TemplateServiceTest.class);

	@Autowired
	private UserService userService;

	@Autowired
	private CouponService couponService;
	
	@Autowired
	private OrderDetailsService orderService;
	
	@Autowired
	private OrderBasicInfoProcessingService test;

	
	 * @Autowired private DataSource dataSource;
	 
	
	@Test
	public void test() {
		
		
		try {
			OrderBasic orderBasic = new OrderBasic();
			//update couponService.orderBasicUpdateQuery
			orderBasic.setOrdId("20131011036599");
			orderBasic.setOrdWrDtm(new java.util.Date());
			orderBasic.setOrdPtrCd("fpttest");
			orderBasic.setOrgOrdId("");
			orderBasic.setBfrOrdId("");
			orderBasic.setCstId("20130828test");
			orderBasic.setOrdInflxPtCd("");
			orderBasic.setAccfPayBnId("");
			orderBasic.setAccfPayAcnNo("");
			orderBasic.setAccfPayRmtr("");
			orderBasic.setAccfPayArrDtm(new java.util.Date());
			orderBasic.setPstmRcvAddrId("");
			orderBasic.setPstmRmtr("");
			orderBasic.setPstmDstArrDtm(new java.util.Date());
			orderBasic.setPgApvDtm(new java.util.Date());
			orderBasic.setPgPayId("");
			orderBasic.setAmtPnPmtId("");
			orderBasic.setAmtPnOtkArrAmt(new BigDecimal(0));
			orderBasic.setAmtPnApYn("");
			orderBasic.setDlvfDsnCpnId("20130828test");
			orderBasic.setDlvfDsnCpnNo("P12978000test");
			orderBasic.setInstId("");
			orderBasic.setInstDtm(new java.util.Date());
			orderBasic.setMdfId("fptteam1");
			orderBasic.setMdfDtm(new java.util.Date());
			String message = test.processing(orderBasic);
			System.err.println("message " + message);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	// System.out.println(dataSource.getConnection().getMetaData().getTables(null,
			// "MSIWEB", "user_test", null));

			// try {
			// Connection connection = dataSource.getConnection();
			//
			// ResultSet resultSet =
			// connection.createStatement().executeQuery("select * from
			// MSIWEB.user_test");
			// System.out.println("---->" + resultSet.getInt(0));
			// } catch (Exception e) {
			// e.printStackTrace();
			// }

			assertNotNull(couponService);

			User user = new User();
			user.setUsername("yendv1");
			user.setEmail("yendv1@gmail.com");
			user.setFullname("yendv");
			user.setPhone("096553332912313123");
			user.setPassword("123456");

			userService.registryUser(user);
			System.err.println(user.getFullname());

			
			 * Optional<User> optional = userService.get(user.getUsername());
			 * 
			 * assertTrue(optional.isPresent());
			 * assertEquals(optional.get().getPhone(), user.getPhone());
			 

			Coupon c = new Coupon();
			java.sql.Date date = new java.sql.Date(new java.util.Date().getTime());
			try {
				
				  couponService.orderBasicUpdateQuery("000000000000000",
				  "0000000orderId", date, "000000000mdfId", null,
				  "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000test"
				  );
				 
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.err.println("hhiihiihhihihihih");
			
			
			try {
				List<OrderDetail> orderDetails = orderService.getByOrdId("20131030553106");
				if(orderDetails != null && !orderDetails.isEmpty()){
					System.err.println("has data");
				}else System.err.println("no data");
				Integer updateRecords = orderService.updateById(new BigDecimal("88"), "20131030553106", "002");
				System.err.println("updateRecords " + updateRecords);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			INSERT INTO GSHS.PRD_CPN_CST_D(
			    CPN_ID, 
			    CPN_PRT_NO,
			    CPN_VLD_DUR_BGN_DTM,
			    CPN_VLD_DUR_CL_DTM,
			    USE_YN,
			    CPN_USE_YN,
			    TEMP_PRT_YN,
			    CPN_CST_INST_TP_CD,
			    INST_ID,MDF_ID
			)
			VALUES(
			    '20130828test',
			    'P12978000test',
			    TO_DATE('26/01/2018' , 'dd/MM/yyyy'),
			    TO_DATE('26/01/2018' , 'dd/MM/yyyy'),
			    'Y',
			    'N','N','20','fptteam1','fptteam1'
			);
}*/
