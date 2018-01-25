/**
 * 
 */
package com.fsoft.template.front.transform;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.util.StringUtils;

import com.fsoft.template.model.OrderBasic;
import com.fsoft.template.request.OrderBasicInfomationRequest;

/**
 * @author YenDV
 *
 */
@MessageEndpoint
public class OrderBasicInfomationTransformer {
	private SimpleDateFormat df = new SimpleDateFormat("");
	@ServiceActivator(inputChannel = "rOrdBsPc-update-channel-2-transform" ,
			outputChannel = "rOrdBsPc-update-channel-3-validate-storage")
	public OrderBasic fromRequest(OrderBasicInfomationRequest request) throws ParseException{
		OrderBasic orderBasic = new OrderBasic();
		orderBasic.setOrdId(request.getIn_ord_id());
		orderBasic.setOrdWrDtm(StringUtils.isEmpty(request.getIn_ord_wr_dtm()) ? null : df.parse(request.getIn_ord_wr_dtm()));
		orderBasic.setOrdPtrCd(request.getIn_ord_ptr_cd());
		orderBasic.setOrgOrdId(request.getIn_org_ord_id());
		orderBasic.setBfrOrdId(request.getIn_bfr_ord_id());
		orderBasic.setCstId(request.getIn_cst_id());
		orderBasic.setOrdInflxPtCd(request.getIn_ord_inflx_pt_cd());
		orderBasic.setAccfPayBnId(request.getIn_accf_pay_bn_id());
		orderBasic.setAccfPayAcnNo(request.getIn_accf_pay_acn_no());
		orderBasic.setAccfPayRmtr(request.getIn_accf_pay_rmtr());
		orderBasic.setAccfPayArrDtm(StringUtils.isEmpty(request.getIn_accf_pay_arr_dtm()) ? null : df.parse(request.getIn_accf_pay_arr_dtm()));
		orderBasic.setPstmRcvAddrId(request.getIn_pstm_rcv_addr_id());
		orderBasic.setPstmRmtr(request.getIn_pstm_rmtr());
		orderBasic.setPstmDstArrDtm(StringUtils.isEmpty(request.getIn_pstm_dst_arr_dtm()) ? null : df.parse(request.getIn_pstm_dst_arr_dtm()));
		orderBasic.setPgApvDtm(StringUtils.isEmpty(request.getIn_pg_apv_dtm()) ? null : df.parse(request.getIn_pg_apv_dtm()));
		orderBasic.setPgPayId(request.getIn_pg_pay_id());
		orderBasic.setAmtPnPmtId(request.getIn_amt_pn_pmt_id() != null ? request.getIn_amt_pn_pmt_id().toString() : null);
		orderBasic.setAmtPnOtkArrAmt(StringUtils.isEmpty(request.getIn_amt_pn_otk_arr_amt()) ? 
				new BigDecimal(request.getIn_amt_pn_otk_arr_amt()) : null);
		orderBasic.setAmtPnApYn(request.getIn_amt_pn_ap_yn());
		orderBasic.setDlvfDsnCpnId(request.getIn_dlvf_dsn_cpn_id());
		orderBasic.setDlvfDsnCpnNo(request.getIn_dlvf_dsn_cpn_no());
		orderBasic.setInstId(request.getIn_inst_id());
		orderBasic.setInstDtm(StringUtils.isEmpty(request.getIn_inst_dtm()) ? null : df.parse(request.getIn_inst_dtm()));
		orderBasic.setMdfId(request.getIn_mdf_id());
		orderBasic.setMdfDtm(StringUtils.isEmpty(request.getIn_mdf_dtm()) ? null : df.parse(request.getIn_mdf_dtm()));
		return orderBasic;
	} 
}
