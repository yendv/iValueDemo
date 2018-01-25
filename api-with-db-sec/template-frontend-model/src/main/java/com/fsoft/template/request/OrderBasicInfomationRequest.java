/**
 * 
 */
package com.fsoft.template.request;

/**
 * @author YenDV
 *
 */
public class OrderBasicInfomationRequest {
	private String in_ord_id;
	private String in_ord_wr_dtm;
	private String in_ord_ptr_cd;//orderTypeCode
	private String in_org_ord_id;//oneOrderId
	private String in_bfr_ord_id;//immediatelyBfOrderId
	private String in_cst_id;//customerId
	private String in_ord_inflx_pt_cd;//orderFunnelCode
	private String in_accf_pay_bn_id;//passbookPaymentBankId
	private String in_accf_pay_acn_no;//passbookPaymentMoneyTraInn
	private String in_accf_pay_rmtr;//temporaryBankbkDepositSche
	private String in_accf_pay_arr_dtm;//moneyOrderIncomingAddressId
	private String in_pstm_rcv_addr_id;//moneyOrderMoneyIn
	private String in_pstm_rmtr;//orderDate
	private String in_pstm_dst_arr_dtm;//pgApprovalDate
	private String in_pg_apv_dtm;//pgPaymentId
	private String in_pg_pay_id;//orderAmountCreaditPromoId
	private Long in_amt_pn_pmt_id ;//Amount of the deposit will be incurred in order
	private String in_amt_pn_otk_arr_amt;//Whether the order amount deposit is applied
	private String in_amt_pn_ap_yn;//shippingDiscountCouponId
	private String in_dlvf_dsn_cpn_id;//shippingDiscountCouponNumber
	private String in_dlvf_dsn_cpn_no;//insertId
	private String in_inst_id;//date registrantionDate
	private String in_inst_dtm;//modifierId
	private String in_mdf_id;//modifyDate
	private String in_mdf_dtm;
	/**
	 * @return the in_ord_id
	 */
	public String getIn_ord_id() {
		return in_ord_id;
	}
	/**
	 * @param in_ord_id the in_ord_id to set
	 */
	public void setIn_ord_id(String in_ord_id) {
		this.in_ord_id = in_ord_id;
	}
	/**
	 * @return the in_ord_wr_dtm
	 */
	public String getIn_ord_wr_dtm() {
		return in_ord_wr_dtm;
	}
	/**
	 * @param in_ord_wr_dtm the in_ord_wr_dtm to set
	 */
	public void setIn_ord_wr_dtm(String in_ord_wr_dtm) {
		this.in_ord_wr_dtm = in_ord_wr_dtm;
	}
	/**
	 * @return the in_ord_ptr_cd
	 */
	public String getIn_ord_ptr_cd() {
		return in_ord_ptr_cd;
	}
	/**
	 * @param in_ord_ptr_cd the in_ord_ptr_cd to set
	 */
	public void setIn_ord_ptr_cd(String in_ord_ptr_cd) {
		this.in_ord_ptr_cd = in_ord_ptr_cd;
	}
	/**
	 * @return the in_org_ord_id
	 */
	public String getIn_org_ord_id() {
		return in_org_ord_id;
	}
	/**
	 * @param in_org_ord_id the in_org_ord_id to set
	 */
	public void setIn_org_ord_id(String in_org_ord_id) {
		this.in_org_ord_id = in_org_ord_id;
	}
	/**
	 * @return the in_bfr_ord_id
	 */
	public String getIn_bfr_ord_id() {
		return in_bfr_ord_id;
	}
	/**
	 * @param in_bfr_ord_id the in_bfr_ord_id to set
	 */
	public void setIn_bfr_ord_id(String in_bfr_ord_id) {
		this.in_bfr_ord_id = in_bfr_ord_id;
	}
	/**
	 * @return the in_cst_id
	 */
	public String getIn_cst_id() {
		return in_cst_id;
	}
	/**
	 * @param in_cst_id the in_cst_id to set
	 */
	public void setIn_cst_id(String in_cst_id) {
		this.in_cst_id = in_cst_id;
	}
	/**
	 * @return the in_ord_inflx_pt_cd
	 */
	public String getIn_ord_inflx_pt_cd() {
		return in_ord_inflx_pt_cd;
	}
	/**
	 * @param in_ord_inflx_pt_cd the in_ord_inflx_pt_cd to set
	 */
	public void setIn_ord_inflx_pt_cd(String in_ord_inflx_pt_cd) {
		this.in_ord_inflx_pt_cd = in_ord_inflx_pt_cd;
	}
	/**
	 * @return the in_accf_pay_bn_id
	 */
	public String getIn_accf_pay_bn_id() {
		return in_accf_pay_bn_id;
	}
	/**
	 * @param in_accf_pay_bn_id the in_accf_pay_bn_id to set
	 */
	public void setIn_accf_pay_bn_id(String in_accf_pay_bn_id) {
		this.in_accf_pay_bn_id = in_accf_pay_bn_id;
	}
	/**
	 * @return the in_accf_pay_acn_no
	 */
	public String getIn_accf_pay_acn_no() {
		return in_accf_pay_acn_no;
	}
	/**
	 * @param in_accf_pay_acn_no the in_accf_pay_acn_no to set
	 */
	public void setIn_accf_pay_acn_no(String in_accf_pay_acn_no) {
		this.in_accf_pay_acn_no = in_accf_pay_acn_no;
	}
	/**
	 * @return the in_accf_pay_rmtr
	 */
	public String getIn_accf_pay_rmtr() {
		return in_accf_pay_rmtr;
	}
	/**
	 * @param in_accf_pay_rmtr the in_accf_pay_rmtr to set
	 */
	public void setIn_accf_pay_rmtr(String in_accf_pay_rmtr) {
		this.in_accf_pay_rmtr = in_accf_pay_rmtr;
	}
	/**
	 * @return the in_accf_pay_arr_dtm
	 */
	public String getIn_accf_pay_arr_dtm() {
		return in_accf_pay_arr_dtm;
	}
	/**
	 * @param in_accf_pay_arr_dtm the in_accf_pay_arr_dtm to set
	 */
	public void setIn_accf_pay_arr_dtm(String in_accf_pay_arr_dtm) {
		this.in_accf_pay_arr_dtm = in_accf_pay_arr_dtm;
	}
	/**
	 * @return the in_pstm_rcv_addr_id
	 */
	public String getIn_pstm_rcv_addr_id() {
		return in_pstm_rcv_addr_id;
	}
	/**
	 * @param in_pstm_rcv_addr_id the in_pstm_rcv_addr_id to set
	 */
	public void setIn_pstm_rcv_addr_id(String in_pstm_rcv_addr_id) {
		this.in_pstm_rcv_addr_id = in_pstm_rcv_addr_id;
	}
	/**
	 * @return the in_pstm_rmtr
	 */
	public String getIn_pstm_rmtr() {
		return in_pstm_rmtr;
	}
	/**
	 * @param in_pstm_rmtr the in_pstm_rmtr to set
	 */
	public void setIn_pstm_rmtr(String in_pstm_rmtr) {
		this.in_pstm_rmtr = in_pstm_rmtr;
	}
	/**
	 * @return the in_pstm_dst_arr_dtm
	 */
	public String getIn_pstm_dst_arr_dtm() {
		return in_pstm_dst_arr_dtm;
	}
	/**
	 * @param in_pstm_dst_arr_dtm the in_pstm_dst_arr_dtm to set
	 */
	public void setIn_pstm_dst_arr_dtm(String in_pstm_dst_arr_dtm) {
		this.in_pstm_dst_arr_dtm = in_pstm_dst_arr_dtm;
	}
	/**
	 * @return the in_pg_apv_dtm
	 */
	public String getIn_pg_apv_dtm() {
		return in_pg_apv_dtm;
	}
	/**
	 * @param in_pg_apv_dtm the in_pg_apv_dtm to set
	 */
	public void setIn_pg_apv_dtm(String in_pg_apv_dtm) {
		this.in_pg_apv_dtm = in_pg_apv_dtm;
	}
	/**
	 * @return the in_pg_pay_id
	 */
	public String getIn_pg_pay_id() {
		return in_pg_pay_id;
	}
	/**
	 * @param in_pg_pay_id the in_pg_pay_id to set
	 */
	public void setIn_pg_pay_id(String in_pg_pay_id) {
		this.in_pg_pay_id = in_pg_pay_id;
	}
	/**
	 * @return the in_amt_pn_pmt_id
	 */
	public Long getIn_amt_pn_pmt_id() {
		return in_amt_pn_pmt_id;
	}
	/**
	 * @param in_amt_pn_pmt_id the in_amt_pn_pmt_id to set
	 */
	public void setIn_amt_pn_pmt_id(Long in_amt_pn_pmt_id) {
		this.in_amt_pn_pmt_id = in_amt_pn_pmt_id;
	}
	/**
	 * @return the in_amt_pn_otk_arr_amt
	 */
	public String getIn_amt_pn_otk_arr_amt() {
		return in_amt_pn_otk_arr_amt;
	}
	/**
	 * @param in_amt_pn_otk_arr_amt the in_amt_pn_otk_arr_amt to set
	 */
	public void setIn_amt_pn_otk_arr_amt(String in_amt_pn_otk_arr_amt) {
		this.in_amt_pn_otk_arr_amt = in_amt_pn_otk_arr_amt;
	}
	/**
	 * @return the in_amt_pn_ap_yn
	 */
	public String getIn_amt_pn_ap_yn() {
		return in_amt_pn_ap_yn;
	}
	/**
	 * @param in_amt_pn_ap_yn the in_amt_pn_ap_yn to set
	 */
	public void setIn_amt_pn_ap_yn(String in_amt_pn_ap_yn) {
		this.in_amt_pn_ap_yn = in_amt_pn_ap_yn;
	}
	/**
	 * @return the in_dlvf_dsn_cpn_id
	 */
	public String getIn_dlvf_dsn_cpn_id() {
		return in_dlvf_dsn_cpn_id;
	}
	/**
	 * @param in_dlvf_dsn_cpn_id the in_dlvf_dsn_cpn_id to set
	 */
	public void setIn_dlvf_dsn_cpn_id(String in_dlvf_dsn_cpn_id) {
		this.in_dlvf_dsn_cpn_id = in_dlvf_dsn_cpn_id;
	}
	/**
	 * @return the in_dlvf_dsn_cpn_no
	 */
	public String getIn_dlvf_dsn_cpn_no() {
		return in_dlvf_dsn_cpn_no;
	}
	/**
	 * @param in_dlvf_dsn_cpn_no the in_dlvf_dsn_cpn_no to set
	 */
	public void setIn_dlvf_dsn_cpn_no(String in_dlvf_dsn_cpn_no) {
		this.in_dlvf_dsn_cpn_no = in_dlvf_dsn_cpn_no;
	}
	/**
	 * @return the in_inst_id
	 */
	public String getIn_inst_id() {
		return in_inst_id;
	}
	/**
	 * @param in_inst_id the in_inst_id to set
	 */
	public void setIn_inst_id(String in_inst_id) {
		this.in_inst_id = in_inst_id;
	}
	/**
	 * @return the in_inst_dtm
	 */
	public String getIn_inst_dtm() {
		return in_inst_dtm;
	}
	/**
	 * @param in_inst_dtm the in_inst_dtm to set
	 */
	public void setIn_inst_dtm(String in_inst_dtm) {
		this.in_inst_dtm = in_inst_dtm;
	}
	/**
	 * @return the in_mdf_id
	 */
	public String getIn_mdf_id() {
		return in_mdf_id;
	}
	/**
	 * @param in_mdf_id the in_mdf_id to set
	 */
	public void setIn_mdf_id(String in_mdf_id) {
		this.in_mdf_id = in_mdf_id;
	}
	/**
	 * @return the in_mdf_dtm
	 */
	public String getIn_mdf_dtm() {
		return in_mdf_dtm;
	}
	/**
	 * @param in_mdf_dtm the in_mdf_dtm to set
	 */
	public void setIn_mdf_dtm(String in_mdf_dtm) {
		this.in_mdf_dtm = in_mdf_dtm;
	}
	
	
	
}
