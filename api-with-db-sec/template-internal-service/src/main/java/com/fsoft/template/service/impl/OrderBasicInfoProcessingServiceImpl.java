package com.fsoft.template.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.util.StringUtils;

import com.fsoft.template.exception.CommonException;
import com.fsoft.template.model.OrderBasic;
import com.fsoft.template.model.OrderDetail;
import com.fsoft.template.repository.exception.RepositoryException;
import com.fsoft.template.service.CouponService;
import com.fsoft.template.service.OrderBasicInfoProcessingService;
import com.fsoft.template.service.OrderBasicService;
import com.fsoft.template.service.OrderDetailsService;
import com.fsoft.template.service.OrderDiscountService;
import com.fsoft.template.service.OrderService;

@MessageEndpoint
public class OrderBasicInfoProcessingServiceImpl implements OrderBasicInfoProcessingService {
	@Autowired
	private CouponService couponService;
	@Autowired
	private OrderDetailsService orderDetailsService;
	@Autowired
	private OrderBasicService odBscService;
	@Autowired
	private OrderService ordService;
	@Autowired
	private OrderDiscountService ordDiscountService;
	
	@ServiceActivator(inputChannel = "rOrdBsPc-update-channel-3-service")
	public String processing(OrderBasic request) throws CommonException{
		StringBuffer result = new StringBuffer("");
		if(!StringUtils.isEmpty(request.getDlvfDsnCpnId())){
			Integer countUpdate = couponService.orderBasicUpdateQuery(request.getCstId(), 
					request.getOrdId(), request.getInstDtm(), 
					request.getMdfId(), request.getMdfDtm(), 
					request.getDlvfDsnCpnId(), 
					request.getDlvfDsnCpnNo());
			if(countUpdate == null || countUpdate.intValue() == 0){
				throw new CommonException(RepositoryException.ORDBSCPRC_ude_err_prd_cpn_cst_d_info ,
						RepositoryException.ORDBSCPRC_ude_err_prd_cpn_cst_d_info_DESCRIPTION, 
						RepositoryException.ORDBSCPRC_ude_err_prd_cpn_cst_d_info_ARGUMENTS);
			}
		}
		System.out.println(request.getOrdId());
		List<OrderDetail> ordDetails =  orderDetailsService.getByOrdId(request.getOrdId());
		if(ordDetails != null && !ordDetails.isEmpty()){
			ordDetails.forEach(ordDetail -> {
				if("Y".equals(ordDetail.getGfYn())){
					//call procedure ->  ln_rtn_pss_dur := PG_ORD_UTIL.FN_ORD_GF_PRD_RTN_PSS_DUR(lrec_gf_info.GF_ORD_ID, lrec_gf_info.GF_ORD_SEQ);
					/*BigDecimal lnRtnPssDur = new BigDecimal(ordDetail.getId().getOrdId() + 
							ordDetail.getId().getOrdSeq());*/
					BigDecimal lnRtnPssDur = new BigDecimal(0);
					int updateRecords = orderDetailsService.updateById(lnRtnPssDur, 
							ordDetail.getId().getOrdId(), ordDetail.getId().getOrdSeq());
					System.out.println("updateRecords " + updateRecords);
				}
			});
		}
		OrderBasic ordBsc = new OrderBasic();
		ordBsc.setOrdId(request.getOrdId());
		//lrec_ord_ord_bsc_m.ORD_BSC_STS_CD         := PG_ORD_STS_CD.FN_ORD_BSC_STS_CD(in_ord_id 
		ordBsc.setOrdBscStsDtm(request.getOrdWrDtm());
		ordBsc.setOrdWrTpCd("100");
		ordBsc.setOrdWrDtm(request.getOrdWrDtm());
		ordBsc.setOrdPtrCd(request.getOrdPtrCd());
		ordBsc.setOrgOrdId(request.getOrgOrdId());
		ordBsc.setBfrOrdId(request.getBfrOrdId());
		ordBsc.setCstId(request.getCstId());
		ordBsc.setOrdInflxPtCd(request.getOrdInflxPtCd());
		ordBsc.setAccfPayBnId(request.getAccfPayBnId());
		ordBsc.setAccfPayAcnNo(request.getAccfPayAcnNo());
		ordBsc.setAccfPayRmtr(request.getAccfPayRmtr());
		ordBsc.setAccfPayArrDtm(request.getAccfPayArrDtm());
		ordBsc.setPstmRcvAddrId(request.getPstmRcvAddrId());
		ordBsc.setPstmRmtr(request.getPstmRmtr());
		ordBsc.setPstmDstArrDtm(request.getPstmDstArrDtm());
		ordBsc.setPgApvDtm(request.getPgApvDtm());
		ordBsc.setPgPayId(request.getPgPayId());
		ordBsc.setAmtPnPmtId(request.getAmtPnPmtId());
		ordBsc.setAmtPnOtkArrAmt(request.getAmtPnOtkArrAmt());
		ordBsc.setAmtPnApYn(request.getAmtPnApYn());
		ordBsc.setDlvfDsnCpnId(request.getDlvfDsnCpnId());
		ordBsc.setDlvfDsnCpnNo(request.getDlvfDsnCpnNo());
		ordBsc.setInstId(request.getInstId());
		ordBsc.setInstDtm(request.getInstDtm());
		ordBsc.setMdfId(request.getMdfId());
		ordBsc.setMdfDtm(request.getMdfDtm());
		ordBsc.setAmtPnCllAmt(request.getAmtPnCllAmt());
		ordBsc.setAmtPnOtkAmt(request.getAmtPnOtkAmt());
		/*
		 * call proc 
		 * 	PG_ORD_ORD_MANAGEMENT.SP_ORD_INSERT_ORD_ORD_BSC_M
	        (
	            in_rec_ord_ord_bsc_m     => lrec_ord_ord_bsc_m           
	           ,out_result_code          => out_result_code               
	           ,out_result_arguments     => out_result_arguments         
	        );
		 * */ 
		String insertOrdOrdBscM = odBscService.saveOrderBasic(ordBsc);
		if(!"00000".equals(insertOrdOrdBscM)){
			throw new CommonException(RepositoryException.ORDBSCPRC_ude_err_prd_cpn_cst_d_info ,
					RepositoryException.ORDBSCPRC_ude_err_prd_cpn_cst_d_info_DESCRIPTION, 
					RepositoryException.ORDBSCPRC_ude_err_prd_cpn_cst_d_info_ARGUMENTS);
		}
		List<OrderBasic> ordBscs = odBscService.getByOrdId(request.getOrdId());
		OrderBasic ordBcs = (ordBscs != null && !ordBscs.isEmpty()) ? ordBscs.get(0) : null;
		String lvAmtPnApYn = ordBcs != null ? ordBcs.getAmtPnApYn() : null ;
		String lvAmtPnPmtId = ordBcs != null ?  ordBcs.getAmtPnPmtId() : null;
		BigDecimal lnAmtPnOtkArrAmt = ordBcs != null ? ordBcs.getAmtPnOtkArrAmt() : null;
		if("Y".equals(lvAmtPnApYn) && lnAmtPnOtkArrAmt != null &&  lnAmtPnOtkArrAmt.intValue() > 0){
			BigDecimal lnPnApCnt = ordService.countById(request.getOrdId(),
					lvAmtPnPmtId);
			if(lnPnApCnt != null && lnPnApCnt.intValue() ==0){
				throw new CommonException(RepositoryException.ORDBSCPRC_ude_err_amt_pn_ap_cnt ,
						RepositoryException.ORDBSCPRC_ude_err_amt_pn_ap_cnt_DESCRIPTION, 
						RepositoryException.ORDBSCPRC_ude_err_amt_pn_ap_cnt_ARGUMENTS);
			}
		}
		/*--상품기반적립금 발생여부 체크
        --[ORD033:적립사유구분코드]
        --100:상품프로모션적립
        --110:상품기본적립
        --120:고객등급적립
        --130:쿠폰적립
        --150:임직원적립*/
		ordDetails = orderDetailsService.getByOrdId(request.getOrdId());
		if(ordDetails != null && !ordDetails.isEmpty()){
			ordDetails.forEach(ordDetail -> {
				if("Y".equals(ordDetail.getPnApYn()) && ordDetail.getPnOtkArrAmt() != null && 
						ordDetail.getPnOtkArrAmt().intValue() > 0){
					BigDecimal lnPnApCnt = ordService.countById(request.getOrdId(), 
							ordDetail.getId().getOrdSeq());
					if(lnPnApCnt != null && lnPnApCnt != null && lnPnApCnt.intValue() == 0)
						try {
							throw new CommonException(RepositoryException.ORDBSCPRC_ude_err_prd_pn_ap_cnt ,
									RepositoryException.ORDBSCPRC_ude_err_prd_pn_ap_cnt_DESCRIPTION, 
									RepositoryException.ORDBSCPRC_ude_err_prd_pn_ap_cnt_ARGUMENTS);
						} catch (CommonException e) {
							e.printStackTrace();
						}
				}
			});
		}
		/*--할인 발생여부 체크*/
		ordDetails = orderDetailsService.getSeqApYnByOrdIdOrderId(request.getOrdId());
		if(ordDetails != null && !ordDetails.isEmpty()){
			ordDetails.forEach(ordDetail -> {
				if("Y".equals(ordDetail.getDsnApYn())){
					BigDecimal ln_dsn_ap_cnt = ordDiscountService.countById(request.getOrdId(),
							ordDetail.getId().getOrdSeq());
					if(ln_dsn_ap_cnt != null && ln_dsn_ap_cnt.intValue() == 0){
						try {
							throw new CommonException(RepositoryException.ORDBSCPRC_ude_err_dsn_ap_cnt ,
									RepositoryException.ORDBSCPRC_ude_err_dsn_ap_cnt_DESCRIPTION, 
									RepositoryException.ORDBSCPRC_ude_err_dsn_ap_cnt_ARGUMENTS);
						} catch (CommonException e) {
							e.printStackTrace();
						}
					}
				}
			});
		}
		result.append("{\"code\" : \"00000\" , \"message\" : \"\"}");
		return result.toString();
	}
	
}
