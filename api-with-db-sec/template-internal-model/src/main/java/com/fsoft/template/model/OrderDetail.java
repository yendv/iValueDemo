package com.fsoft.template.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;



@Entity
@Table(name="ORD_ORD_DTL_D")
public class OrderDetail implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ORD_ID")
	private String ordId;

	@Column(name="AR_DCLS_ID")
	private String arDclsId;

	@Column(name="AR_LCLS_ID")
	private String arLclsId;

	@Column(name="AR_MCLS_ID")
	private String arMclsId;

	@Column(name="AR_SCLS_ID")
	private String arSclsId;

	@Column(name="AS_PSS_DUR")
	private BigDecimal asPssDur;

	@Column(name="AVG_DLV_DUR")
	private BigDecimal avgDlvDur;

	@Column(name="BFR_ORD_ID")
	private String bfrOrdId;

	@Column(name="BFR_ORD_SEQ")
	private String bfrOrdSeq;

	@Column(name="BOX_QTY")
	private BigDecimal boxQty;

	@Column(name="BRND_ID")
	private String brndId;

	@Column(name="COMP_PRD_CNN")
	private String compPrdCnn;

	@Column(name="CST_GD_CD")
	private String cstGdCd;

	@Column(name="CST_ID")
	private String cstId;

	@Column(name="DLG_PRD_ID")
	private String dlgPrdId;

	@Column(name="DLR_ID")
	private String dlrId;

	@Column(name="DLV_ADDR_SEQ")
	private String dlvAddrSeq;

	@Temporal(TemporalType.DATE)
	@Column(name="DLV_ARR_DTM")
	private Date dlvArrDtm;

	@Temporal(TemporalType.DATE)
	@Column(name="DLV_CMP_DTM")
	private Date dlvCmpDtm;

	@Column(name="DLV_CMP_QTY")
	private BigDecimal dlvCmpQty;

	@Temporal(TemporalType.DATE)
	@Column(name="DLV_CO_DLV_CMP_DTM")
	private Date dlvCoDlvCmpDtm;

	@Column(name="DLV_CO_ID")
	private String dlvCoId;

	@Column(name="DLV_MSG")
	private String dlvMsg;

	@Column(name="DLV_MTD_CD")
	private String dlvMtdCd;

	private BigDecimal dlvf;

	@Column(name="DLVF_DSN_AMT")
	private BigDecimal dlvfDsnAmt;

	@Column(name="DLVF_LS_AMT")
	private BigDecimal dlvfLsAmt;

	@Column(name="DSN_AP_YN")
	private String dsnApYn;

	@Column(name="EXN_PSS_YN")
	private String exnPssYn;

	@Column(name="EXN_RTN_ID")
	private String exnRtnId;

	@Column(name="EXN_RTN_SEQ")
	private String exnRtnSeq;

	@Column(name="GF_CLL_YN")
	private String gfCllYn;

	@Column(name="GF_INCL_YN")
	private String gfInclYn;

	@Column(name="GF_ORG_PRD_ORD_SEQ")
	private String gfOrgPrdOrdSeq;

	@Column(name="GF_PMT_DLR_BRN_AMT")
	private BigDecimal gfPmtDlrBrnAmt;

	@Column(name="GF_PMT_DLR_BRN_RT_AMT")
	private BigDecimal gfPmtDlrBrnRtAmt;

	@Column(name="GF_PMT_DLR_BRN_YN")
	private String gfPmtDlrBrnYn;

	@Column(name="GF_PMT_ID")
	private String gfPmtId;

	@Column(name="GF_PMT_RT_AMT_TP_CD")
	private String gfPmtRtAmtTpCd;

	@Column(name="GF_PMT_SHOP_BRN_AMT")
	private BigDecimal gfPmtShopBrnAmt;

	@Column(name="GF_PMT_SHOP_BRN_RT_AMT")
	private BigDecimal gfPmtShopBrnRtAmt;

	@Column(name="GF_RSN_TP_CD")
	private String gfRsnTpCd;

	@Column(name="GF_YN")
	private String gfYn;

	@Temporal(TemporalType.DATE)
	@Column(name="INST_DTM")
	private Date instDtm;

	@Column(name="INST_ID")
	private String instId;

	@Column(name="INTF_INTT_MMS")
	private BigDecimal intfInttMms;

	@Column(name="INTF_INTT_YN")
	private String intfInttYn;

	@Column(name="LRGN_ID")
	private String lrgnId;

	@Column(name="MD_ID")
	private String mdId;

	@Temporal(TemporalType.DATE)
	@Column(name="MDF_DTM")
	private Date mdfDtm;

	@Column(name="MDF_ID")
	private String mdfId;

	@Column(name="ML_PRD_ID")
	private String mlPrdId;

	@Column(name="MOD_PYM_YN")
	private String modPymYn;

	@Column(name="MRGN_ID")
	private String mrgnId;

	@Temporal(TemporalType.DATE)
	@Column(name="ORD_ACP_DTM")
	private Date ordAcpDtm;

	@Column(name="ORD_AMT")
	private BigDecimal ordAmt;

	@Column(name="ORD_CHNL_DTL_ID")
	private String ordChnlDtlId;

	@Column(name="ORD_CHNL_ID")
	private String ordChnlId;

	@Column(name="ORD_CNL_DTL_RSN_CD")
	private String ordCnlDtlRsnCd;

	@Temporal(TemporalType.DATE)
	@Column(name="ORD_CNL_DTM")
	private Date ordCnlDtm;

	@Column(name="ORD_CNL_RSN_CD")
	private String ordCnlRsnCd;

	@Column(name="ORD_CNL_RSN_CMMT")
	private String ordCnlRsnCmmt;

	@Column(name="ORD_CNL_TM_ID")
	private String ordCnlTmId;

	@Column(name="ORD_DTL_STS_CD")
	private String ordDtlStsCd;

	@Temporal(TemporalType.DATE)
	@Column(name="ORD_DTL_STS_DTM")
	private Date ordDtlStsDtm;

	@Column(name="ORD_MDA_CD")
	private String ordMdaCd;

	@Column(name="ORD_PC")
	private BigDecimal ordPc;

	@Column(name="ORD_PTR_CD")
	private String ordPtrCd;

	@Column(name="ORD_QTY")
	private BigDecimal ordQty;

	@Column(name="ORD_STS_CD")
	private String ordStsCd;

	@Temporal(TemporalType.DATE)
	@Column(name="ORD_STS_DTM")
	private Date ordStsDtm;

	@Column(name="ORD_SUPP_STS_CD")
	private String ordSuppStsCd;

	@Temporal(TemporalType.DATE)
	@Column(name="ORD_SUPP_STS_DTM")
	private Date ordSuppStsDtm;

	@Column(name="ORD_WH_NO")
	private String ordWhNo;

	@Column(name="ORG_ORD_ID")
	private String orgOrdId;

	@Column(name="ORG_ORD_SEQ")
	private String orgOrdSeq;

	@Column(name="PN_AP_YN")
	private String pnApYn;

	@Column(name="PN_OTK_AMT")
	private BigDecimal pnOtkAmt;

	@Column(name="PN_OTK_ARR_AMT")
	private BigDecimal pnOtkArrAmt;

	@Temporal(TemporalType.DATE)
	@Column(name="PN_OTK_DTM")
	private Date pnOtkDtm;

	@Column(name="PRD_ID")
	private String prdId;

	@Column(name="PRD_NM")
	private String prdNm;

	@Column(name="PRD_PTR_CD")
	private String prdPtrCd;

	@Column(name="PRD_SP_CD")
	private String prdSpCd;

	@Column(name="PRE_RFN_TRT_YN")
	private String preRfnTrtYn;

	@Column(name="PRS_COST")
	private BigDecimal prsCost;

	@Column(name="PRS_PC")
	private BigDecimal prsPc;

	@Column(name="PRS_SCT_RT_CD")
	private String prsSctRtCd;

	@Column(name="PRS_VAT_AMT")
	private BigDecimal prsVatAmt;

	@Column(name="PRS_VAT_RT_CD")
	private String prsVatRtCd;

	@Column(name="PRS_VAT_TP_CD")
	private String prsVatTpCd;

	@Column(name="RCP_INVC_UNT_PRD_NM")
	private String rcpInvcUntPrdNm;

	@Column(name="RCP_ND_YN")
	private String rcpNdYn;

	@Column(name="RCP_PRT_TP_CD")
	private String rcpPrtTpCd;

	@Column(name="RCP_TT_NM")
	private String rcpTtNm;

	@Column(name="RTN_ACP_QTY")
	private BigDecimal rtnAcpQty;

	@Column(name="RTN_EXN_DTL_RSN_CD")
	private String rtnExnDtlRsnCd;

	@Temporal(TemporalType.DATE)
	@Column(name="RTN_EXN_DTM")
	private Date rtnExnDtm;

	@Column(name="RTN_EXN_RSN_CD")
	private String rtnExnRsnCd;

	@Column(name="RTN_EXN_RSN_CMMT")
	private String rtnExnRsnCmmt;

	@Column(name="RTN_EXN_TM_ID")
	private String rtnExnTmId;

	@Column(name="RTN_PSS_DUR")
	private BigDecimal rtnPssDur;

	@Column(name="RTN_PSS_YN")
	private String rtnPssYn;

	@Column(name="SET_PRD_ID")
	private String setPrdId;

	@Column(name="SET_PRD_NM")
	private String setPrdNm;

	@Column(name="SET_PRD_UNT_COMP_SEQ")
	private String setPrdUntCompSeq;

	@Column(name="SET_PRD_UNT_NM")
	private String setPrdUntNm;

	@Column(name="SET_PRD_UNT_PRD_ID")
	private String setPrdUntPrdId;

	@Column(name="SET_PRD_UNT_PRD_NM")
	private String setPrdUntPrdNm;

	@Column(name="SET_PRD_UNT_SEQ")
	private String setPrdUntSeq;

	@Column(name="SET_PRD_UNT_SEQ_DG")
	private String setPrdUntSeqDg;

	@Column(name="SET_PRD_YN")
	private String setPrdYn;

	@Temporal(TemporalType.DATE)
	@Column(name="SHIP_CMD_ARR_DTM")
	private Date shipCmdArrDtm;

	@Column(name="SL_COST")
	private BigDecimal slCost;

	@Column(name="SL_PC")
	private BigDecimal slPc;

	@Column(name="SL_SCT_RT_CD")
	private String slSctRtCd;

	@Column(name="SL_VAT_AMT")
	private BigDecimal slVatAmt;

	@Column(name="SL_VAT_RT_CD")
	private String slVatRtCd;

	@Column(name="SL_VAT_TP_CD")
	private String slVatTpCd;

	@Temporal(TemporalType.DATE)
	@Column(name="SLS_CNFM_DTM")
	private Date slsCnfmDtm;

	@Temporal(TemporalType.DATE)
	@Column(name="SPC_PRD_ORD_HNG_DTM")
	private Date spcPrdOrdHngDtm;

	@Column(name="SPC_PRD_ORD_HNG_TP_CD")
	private String spcPrdOrdHngTpCd;

	@Column(name="SRGN_ID")
	private String srgnId;

	@Column(name="STKO_PTR_TP_CD")
	private String stkoPtrTpCd;

	@Column(name="STKO_WH_NO")
	private String stkoWhNo;

	@Column(name="STKO_WH_PTR_CD")
	private String stkoWhPtrCd;

	@Column(name="UNT_NM")
	private String untNm;

	@Column(name="UNT_PRD_ID")
	private String untPrdId;

	@Column(name="UNT_PRD_NM")
	private String untPrdNm;

	@Column(name="UNT_SEQ")
	private String untSeq;

	public OrderDetail() {
	}

	public String getArDclsId() {
		return this.arDclsId;
	}

	public void setArDclsId(String arDclsId) {
		this.arDclsId = arDclsId;
	}

	public String getArLclsId() {
		return this.arLclsId;
	}

	public void setArLclsId(String arLclsId) {
		this.arLclsId = arLclsId;
	}

	public String getArMclsId() {
		return this.arMclsId;
	}

	public void setArMclsId(String arMclsId) {
		this.arMclsId = arMclsId;
	}

	public String getArSclsId() {
		return this.arSclsId;
	}

	public void setArSclsId(String arSclsId) {
		this.arSclsId = arSclsId;
	}

	public BigDecimal getAsPssDur() {
		return this.asPssDur;
	}

	public void setAsPssDur(BigDecimal asPssDur) {
		this.asPssDur = asPssDur;
	}

	public BigDecimal getAvgDlvDur() {
		return this.avgDlvDur;
	}

	public void setAvgDlvDur(BigDecimal avgDlvDur) {
		this.avgDlvDur = avgDlvDur;
	}

	public String getBfrOrdId() {
		return this.bfrOrdId;
	}

	public void setBfrOrdId(String bfrOrdId) {
		this.bfrOrdId = bfrOrdId;
	}

	public String getBfrOrdSeq() {
		return this.bfrOrdSeq;
	}

	public void setBfrOrdSeq(String bfrOrdSeq) {
		this.bfrOrdSeq = bfrOrdSeq;
	}

	public BigDecimal getBoxQty() {
		return this.boxQty;
	}

	public void setBoxQty(BigDecimal boxQty) {
		this.boxQty = boxQty;
	}

	public String getBrndId() {
		return this.brndId;
	}

	public void setBrndId(String brndId) {
		this.brndId = brndId;
	}

	public String getCompPrdCnn() {
		return this.compPrdCnn;
	}

	public void setCompPrdCnn(String compPrdCnn) {
		this.compPrdCnn = compPrdCnn;
	}

	public String getCstGdCd() {
		return this.cstGdCd;
	}

	public void setCstGdCd(String cstGdCd) {
		this.cstGdCd = cstGdCd;
	}

	public String getCstId() {
		return this.cstId;
	}

	public void setCstId(String cstId) {
		this.cstId = cstId;
	}

	public String getDlgPrdId() {
		return this.dlgPrdId;
	}

	public void setDlgPrdId(String dlgPrdId) {
		this.dlgPrdId = dlgPrdId;
	}

	public String getDlrId() {
		return this.dlrId;
	}

	public void setDlrId(String dlrId) {
		this.dlrId = dlrId;
	}

	public String getDlvAddrSeq() {
		return this.dlvAddrSeq;
	}

	public void setDlvAddrSeq(String dlvAddrSeq) {
		this.dlvAddrSeq = dlvAddrSeq;
	}

	public Date getDlvArrDtm() {
		return this.dlvArrDtm;
	}

	public void setDlvArrDtm(Date dlvArrDtm) {
		this.dlvArrDtm = dlvArrDtm;
	}

	public Date getDlvCmpDtm() {
		return this.dlvCmpDtm;
	}

	public void setDlvCmpDtm(Date dlvCmpDtm) {
		this.dlvCmpDtm = dlvCmpDtm;
	}

	public BigDecimal getDlvCmpQty() {
		return this.dlvCmpQty;
	}

	public void setDlvCmpQty(BigDecimal dlvCmpQty) {
		this.dlvCmpQty = dlvCmpQty;
	}

	public Date getDlvCoDlvCmpDtm() {
		return this.dlvCoDlvCmpDtm;
	}

	public void setDlvCoDlvCmpDtm(Date dlvCoDlvCmpDtm) {
		this.dlvCoDlvCmpDtm = dlvCoDlvCmpDtm;
	}

	public String getDlvCoId() {
		return this.dlvCoId;
	}

	public void setDlvCoId(String dlvCoId) {
		this.dlvCoId = dlvCoId;
	}

	public String getDlvMsg() {
		return this.dlvMsg;
	}

	public void setDlvMsg(String dlvMsg) {
		this.dlvMsg = dlvMsg;
	}

	public String getDlvMtdCd() {
		return this.dlvMtdCd;
	}

	public void setDlvMtdCd(String dlvMtdCd) {
		this.dlvMtdCd = dlvMtdCd;
	}

	public BigDecimal getDlvf() {
		return this.dlvf;
	}

	public void setDlvf(BigDecimal dlvf) {
		this.dlvf = dlvf;
	}

	public BigDecimal getDlvfDsnAmt() {
		return this.dlvfDsnAmt;
	}

	public void setDlvfDsnAmt(BigDecimal dlvfDsnAmt) {
		this.dlvfDsnAmt = dlvfDsnAmt;
	}

	public BigDecimal getDlvfLsAmt() {
		return this.dlvfLsAmt;
	}

	public void setDlvfLsAmt(BigDecimal dlvfLsAmt) {
		this.dlvfLsAmt = dlvfLsAmt;
	}

	public String getDsnApYn() {
		return this.dsnApYn;
	}

	public void setDsnApYn(String dsnApYn) {
		this.dsnApYn = dsnApYn;
	}

	public String getExnPssYn() {
		return this.exnPssYn;
	}

	public void setExnPssYn(String exnPssYn) {
		this.exnPssYn = exnPssYn;
	}

	public String getExnRtnId() {
		return this.exnRtnId;
	}

	public void setExnRtnId(String exnRtnId) {
		this.exnRtnId = exnRtnId;
	}

	public String getExnRtnSeq() {
		return this.exnRtnSeq;
	}

	public void setExnRtnSeq(String exnRtnSeq) {
		this.exnRtnSeq = exnRtnSeq;
	}

	public String getGfCllYn() {
		return this.gfCllYn;
	}

	public void setGfCllYn(String gfCllYn) {
		this.gfCllYn = gfCllYn;
	}

	public String getGfInclYn() {
		return this.gfInclYn;
	}

	public void setGfInclYn(String gfInclYn) {
		this.gfInclYn = gfInclYn;
	}

	public String getGfOrgPrdOrdSeq() {
		return this.gfOrgPrdOrdSeq;
	}

	public void setGfOrgPrdOrdSeq(String gfOrgPrdOrdSeq) {
		this.gfOrgPrdOrdSeq = gfOrgPrdOrdSeq;
	}

	public BigDecimal getGfPmtDlrBrnAmt() {
		return this.gfPmtDlrBrnAmt;
	}

	public void setGfPmtDlrBrnAmt(BigDecimal gfPmtDlrBrnAmt) {
		this.gfPmtDlrBrnAmt = gfPmtDlrBrnAmt;
	}

	public BigDecimal getGfPmtDlrBrnRtAmt() {
		return this.gfPmtDlrBrnRtAmt;
	}

	public void setGfPmtDlrBrnRtAmt(BigDecimal gfPmtDlrBrnRtAmt) {
		this.gfPmtDlrBrnRtAmt = gfPmtDlrBrnRtAmt;
	}

	public String getGfPmtDlrBrnYn() {
		return this.gfPmtDlrBrnYn;
	}

	public void setGfPmtDlrBrnYn(String gfPmtDlrBrnYn) {
		this.gfPmtDlrBrnYn = gfPmtDlrBrnYn;
	}

	public String getGfPmtId() {
		return this.gfPmtId;
	}

	public void setGfPmtId(String gfPmtId) {
		this.gfPmtId = gfPmtId;
	}

	public String getGfPmtRtAmtTpCd() {
		return this.gfPmtRtAmtTpCd;
	}

	public void setGfPmtRtAmtTpCd(String gfPmtRtAmtTpCd) {
		this.gfPmtRtAmtTpCd = gfPmtRtAmtTpCd;
	}

	public BigDecimal getGfPmtShopBrnAmt() {
		return this.gfPmtShopBrnAmt;
	}

	public void setGfPmtShopBrnAmt(BigDecimal gfPmtShopBrnAmt) {
		this.gfPmtShopBrnAmt = gfPmtShopBrnAmt;
	}

	public BigDecimal getGfPmtShopBrnRtAmt() {
		return this.gfPmtShopBrnRtAmt;
	}

	public void setGfPmtShopBrnRtAmt(BigDecimal gfPmtShopBrnRtAmt) {
		this.gfPmtShopBrnRtAmt = gfPmtShopBrnRtAmt;
	}

	public String getGfRsnTpCd() {
		return this.gfRsnTpCd;
	}

	public void setGfRsnTpCd(String gfRsnTpCd) {
		this.gfRsnTpCd = gfRsnTpCd;
	}

	public String getGfYn() {
		return this.gfYn;
	}

	public void setGfYn(String gfYn) {
		this.gfYn = gfYn;
	}

	public Date getInstDtm() {
		return this.instDtm;
	}

	public void setInstDtm(Date instDtm) {
		this.instDtm = instDtm;
	}

	public String getInstId() {
		return this.instId;
	}

	public void setInstId(String instId) {
		this.instId = instId;
	}

	public BigDecimal getIntfInttMms() {
		return this.intfInttMms;
	}

	public void setIntfInttMms(BigDecimal intfInttMms) {
		this.intfInttMms = intfInttMms;
	}

	public String getIntfInttYn() {
		return this.intfInttYn;
	}

	public void setIntfInttYn(String intfInttYn) {
		this.intfInttYn = intfInttYn;
	}

	public String getLrgnId() {
		return this.lrgnId;
	}

	public void setLrgnId(String lrgnId) {
		this.lrgnId = lrgnId;
	}

	public String getMdId() {
		return this.mdId;
	}

	public void setMdId(String mdId) {
		this.mdId = mdId;
	}

	public Date getMdfDtm() {
		return this.mdfDtm;
	}

	public void setMdfDtm(Date mdfDtm) {
		this.mdfDtm = mdfDtm;
	}

	public String getMdfId() {
		return this.mdfId;
	}

	public void setMdfId(String mdfId) {
		this.mdfId = mdfId;
	}

	public String getMlPrdId() {
		return this.mlPrdId;
	}

	public void setMlPrdId(String mlPrdId) {
		this.mlPrdId = mlPrdId;
	}

	public String getModPymYn() {
		return this.modPymYn;
	}

	public void setModPymYn(String modPymYn) {
		this.modPymYn = modPymYn;
	}

	public String getMrgnId() {
		return this.mrgnId;
	}

	public void setMrgnId(String mrgnId) {
		this.mrgnId = mrgnId;
	}

	public Date getOrdAcpDtm() {
		return this.ordAcpDtm;
	}

	public void setOrdAcpDtm(Date ordAcpDtm) {
		this.ordAcpDtm = ordAcpDtm;
	}

	public BigDecimal getOrdAmt() {
		return this.ordAmt;
	}

	public void setOrdAmt(BigDecimal ordAmt) {
		this.ordAmt = ordAmt;
	}

	public String getOrdChnlDtlId() {
		return this.ordChnlDtlId;
	}

	public void setOrdChnlDtlId(String ordChnlDtlId) {
		this.ordChnlDtlId = ordChnlDtlId;
	}

	public String getOrdChnlId() {
		return this.ordChnlId;
	}

	public void setOrdChnlId(String ordChnlId) {
		this.ordChnlId = ordChnlId;
	}

	public String getOrdCnlDtlRsnCd() {
		return this.ordCnlDtlRsnCd;
	}

	public void setOrdCnlDtlRsnCd(String ordCnlDtlRsnCd) {
		this.ordCnlDtlRsnCd = ordCnlDtlRsnCd;
	}

	public Date getOrdCnlDtm() {
		return this.ordCnlDtm;
	}

	public void setOrdCnlDtm(Date ordCnlDtm) {
		this.ordCnlDtm = ordCnlDtm;
	}

	public String getOrdCnlRsnCd() {
		return this.ordCnlRsnCd;
	}

	public void setOrdCnlRsnCd(String ordCnlRsnCd) {
		this.ordCnlRsnCd = ordCnlRsnCd;
	}

	public String getOrdCnlRsnCmmt() {
		return this.ordCnlRsnCmmt;
	}

	public void setOrdCnlRsnCmmt(String ordCnlRsnCmmt) {
		this.ordCnlRsnCmmt = ordCnlRsnCmmt;
	}

	public String getOrdCnlTmId() {
		return this.ordCnlTmId;
	}

	public void setOrdCnlTmId(String ordCnlTmId) {
		this.ordCnlTmId = ordCnlTmId;
	}

	public String getOrdDtlStsCd() {
		return this.ordDtlStsCd;
	}

	public void setOrdDtlStsCd(String ordDtlStsCd) {
		this.ordDtlStsCd = ordDtlStsCd;
	}

	public Date getOrdDtlStsDtm() {
		return this.ordDtlStsDtm;
	}

	public void setOrdDtlStsDtm(Date ordDtlStsDtm) {
		this.ordDtlStsDtm = ordDtlStsDtm;
	}

	public String getOrdMdaCd() {
		return this.ordMdaCd;
	}

	public void setOrdMdaCd(String ordMdaCd) {
		this.ordMdaCd = ordMdaCd;
	}

	public BigDecimal getOrdPc() {
		return this.ordPc;
	}

	public void setOrdPc(BigDecimal ordPc) {
		this.ordPc = ordPc;
	}

	public String getOrdPtrCd() {
		return this.ordPtrCd;
	}

	public void setOrdPtrCd(String ordPtrCd) {
		this.ordPtrCd = ordPtrCd;
	}

	public BigDecimal getOrdQty() {
		return this.ordQty;
	}

	public void setOrdQty(BigDecimal ordQty) {
		this.ordQty = ordQty;
	}

	public String getOrdStsCd() {
		return this.ordStsCd;
	}

	public void setOrdStsCd(String ordStsCd) {
		this.ordStsCd = ordStsCd;
	}

	public Date getOrdStsDtm() {
		return this.ordStsDtm;
	}

	public void setOrdStsDtm(Date ordStsDtm) {
		this.ordStsDtm = ordStsDtm;
	}

	public String getOrdSuppStsCd() {
		return this.ordSuppStsCd;
	}

	public void setOrdSuppStsCd(String ordSuppStsCd) {
		this.ordSuppStsCd = ordSuppStsCd;
	}

	public Date getOrdSuppStsDtm() {
		return this.ordSuppStsDtm;
	}

	public void setOrdSuppStsDtm(Date ordSuppStsDtm) {
		this.ordSuppStsDtm = ordSuppStsDtm;
	}

	public String getOrdWhNo() {
		return this.ordWhNo;
	}

	public void setOrdWhNo(String ordWhNo) {
		this.ordWhNo = ordWhNo;
	}

	public String getOrgOrdId() {
		return this.orgOrdId;
	}

	public void setOrgOrdId(String orgOrdId) {
		this.orgOrdId = orgOrdId;
	}

	public String getOrgOrdSeq() {
		return this.orgOrdSeq;
	}

	public void setOrgOrdSeq(String orgOrdSeq) {
		this.orgOrdSeq = orgOrdSeq;
	}

	public String getPnApYn() {
		return this.pnApYn;
	}

	public void setPnApYn(String pnApYn) {
		this.pnApYn = pnApYn;
	}

	public BigDecimal getPnOtkAmt() {
		return this.pnOtkAmt;
	}

	public void setPnOtkAmt(BigDecimal pnOtkAmt) {
		this.pnOtkAmt = pnOtkAmt;
	}

	public BigDecimal getPnOtkArrAmt() {
		return this.pnOtkArrAmt;
	}

	public void setPnOtkArrAmt(BigDecimal pnOtkArrAmt) {
		this.pnOtkArrAmt = pnOtkArrAmt;
	}

	public Date getPnOtkDtm() {
		return this.pnOtkDtm;
	}

	public void setPnOtkDtm(Date pnOtkDtm) {
		this.pnOtkDtm = pnOtkDtm;
	}

	public String getPrdId() {
		return this.prdId;
	}

	public void setPrdId(String prdId) {
		this.prdId = prdId;
	}

	public String getPrdNm() {
		return this.prdNm;
	}

	public void setPrdNm(String prdNm) {
		this.prdNm = prdNm;
	}

	public String getPrdPtrCd() {
		return this.prdPtrCd;
	}

	public void setPrdPtrCd(String prdPtrCd) {
		this.prdPtrCd = prdPtrCd;
	}

	public String getPrdSpCd() {
		return this.prdSpCd;
	}

	public void setPrdSpCd(String prdSpCd) {
		this.prdSpCd = prdSpCd;
	}

	public String getPreRfnTrtYn() {
		return this.preRfnTrtYn;
	}

	public void setPreRfnTrtYn(String preRfnTrtYn) {
		this.preRfnTrtYn = preRfnTrtYn;
	}

	public BigDecimal getPrsCost() {
		return this.prsCost;
	}

	public void setPrsCost(BigDecimal prsCost) {
		this.prsCost = prsCost;
	}

	public BigDecimal getPrsPc() {
		return this.prsPc;
	}

	public void setPrsPc(BigDecimal prsPc) {
		this.prsPc = prsPc;
	}

	public String getPrsSctRtCd() {
		return this.prsSctRtCd;
	}

	public void setPrsSctRtCd(String prsSctRtCd) {
		this.prsSctRtCd = prsSctRtCd;
	}

	public BigDecimal getPrsVatAmt() {
		return this.prsVatAmt;
	}

	public void setPrsVatAmt(BigDecimal prsVatAmt) {
		this.prsVatAmt = prsVatAmt;
	}

	public String getPrsVatRtCd() {
		return this.prsVatRtCd;
	}

	public void setPrsVatRtCd(String prsVatRtCd) {
		this.prsVatRtCd = prsVatRtCd;
	}

	public String getPrsVatTpCd() {
		return this.prsVatTpCd;
	}

	public void setPrsVatTpCd(String prsVatTpCd) {
		this.prsVatTpCd = prsVatTpCd;
	}

	public String getRcpInvcUntPrdNm() {
		return this.rcpInvcUntPrdNm;
	}

	public void setRcpInvcUntPrdNm(String rcpInvcUntPrdNm) {
		this.rcpInvcUntPrdNm = rcpInvcUntPrdNm;
	}

	public String getRcpNdYn() {
		return this.rcpNdYn;
	}

	public void setRcpNdYn(String rcpNdYn) {
		this.rcpNdYn = rcpNdYn;
	}

	public String getRcpPrtTpCd() {
		return this.rcpPrtTpCd;
	}

	public void setRcpPrtTpCd(String rcpPrtTpCd) {
		this.rcpPrtTpCd = rcpPrtTpCd;
	}

	public String getRcpTtNm() {
		return this.rcpTtNm;
	}

	public void setRcpTtNm(String rcpTtNm) {
		this.rcpTtNm = rcpTtNm;
	}

	public BigDecimal getRtnAcpQty() {
		return this.rtnAcpQty;
	}

	public void setRtnAcpQty(BigDecimal rtnAcpQty) {
		this.rtnAcpQty = rtnAcpQty;
	}

	public String getRtnExnDtlRsnCd() {
		return this.rtnExnDtlRsnCd;
	}

	public void setRtnExnDtlRsnCd(String rtnExnDtlRsnCd) {
		this.rtnExnDtlRsnCd = rtnExnDtlRsnCd;
	}

	public Date getRtnExnDtm() {
		return this.rtnExnDtm;
	}

	public void setRtnExnDtm(Date rtnExnDtm) {
		this.rtnExnDtm = rtnExnDtm;
	}

	public String getRtnExnRsnCd() {
		return this.rtnExnRsnCd;
	}

	public void setRtnExnRsnCd(String rtnExnRsnCd) {
		this.rtnExnRsnCd = rtnExnRsnCd;
	}

	public String getRtnExnRsnCmmt() {
		return this.rtnExnRsnCmmt;
	}

	public void setRtnExnRsnCmmt(String rtnExnRsnCmmt) {
		this.rtnExnRsnCmmt = rtnExnRsnCmmt;
	}

	public String getRtnExnTmId() {
		return this.rtnExnTmId;
	}

	public void setRtnExnTmId(String rtnExnTmId) {
		this.rtnExnTmId = rtnExnTmId;
	}

	public BigDecimal getRtnPssDur() {
		return this.rtnPssDur;
	}

	public void setRtnPssDur(BigDecimal rtnPssDur) {
		this.rtnPssDur = rtnPssDur;
	}

	public String getRtnPssYn() {
		return this.rtnPssYn;
	}

	public void setRtnPssYn(String rtnPssYn) {
		this.rtnPssYn = rtnPssYn;
	}

	public String getSetPrdId() {
		return this.setPrdId;
	}

	public void setSetPrdId(String setPrdId) {
		this.setPrdId = setPrdId;
	}

	public String getSetPrdNm() {
		return this.setPrdNm;
	}

	public void setSetPrdNm(String setPrdNm) {
		this.setPrdNm = setPrdNm;
	}

	public String getSetPrdUntCompSeq() {
		return this.setPrdUntCompSeq;
	}

	public void setSetPrdUntCompSeq(String setPrdUntCompSeq) {
		this.setPrdUntCompSeq = setPrdUntCompSeq;
	}

	public String getSetPrdUntNm() {
		return this.setPrdUntNm;
	}

	public void setSetPrdUntNm(String setPrdUntNm) {
		this.setPrdUntNm = setPrdUntNm;
	}

	public String getSetPrdUntPrdId() {
		return this.setPrdUntPrdId;
	}

	public void setSetPrdUntPrdId(String setPrdUntPrdId) {
		this.setPrdUntPrdId = setPrdUntPrdId;
	}

	public String getSetPrdUntPrdNm() {
		return this.setPrdUntPrdNm;
	}

	public void setSetPrdUntPrdNm(String setPrdUntPrdNm) {
		this.setPrdUntPrdNm = setPrdUntPrdNm;
	}

	public String getSetPrdUntSeq() {
		return this.setPrdUntSeq;
	}

	public void setSetPrdUntSeq(String setPrdUntSeq) {
		this.setPrdUntSeq = setPrdUntSeq;
	}

	public String getSetPrdUntSeqDg() {
		return this.setPrdUntSeqDg;
	}

	public void setSetPrdUntSeqDg(String setPrdUntSeqDg) {
		this.setPrdUntSeqDg = setPrdUntSeqDg;
	}

	public String getSetPrdYn() {
		return this.setPrdYn;
	}

	public void setSetPrdYn(String setPrdYn) {
		this.setPrdYn = setPrdYn;
	}

	public Date getShipCmdArrDtm() {
		return this.shipCmdArrDtm;
	}

	public void setShipCmdArrDtm(Date shipCmdArrDtm) {
		this.shipCmdArrDtm = shipCmdArrDtm;
	}

	public BigDecimal getSlCost() {
		return this.slCost;
	}

	public void setSlCost(BigDecimal slCost) {
		this.slCost = slCost;
	}

	public BigDecimal getSlPc() {
		return this.slPc;
	}

	public void setSlPc(BigDecimal slPc) {
		this.slPc = slPc;
	}

	public String getSlSctRtCd() {
		return this.slSctRtCd;
	}

	public void setSlSctRtCd(String slSctRtCd) {
		this.slSctRtCd = slSctRtCd;
	}

	public BigDecimal getSlVatAmt() {
		return this.slVatAmt;
	}

	public void setSlVatAmt(BigDecimal slVatAmt) {
		this.slVatAmt = slVatAmt;
	}

	public String getSlVatRtCd() {
		return this.slVatRtCd;
	}

	public void setSlVatRtCd(String slVatRtCd) {
		this.slVatRtCd = slVatRtCd;
	}

	public String getSlVatTpCd() {
		return this.slVatTpCd;
	}

	public void setSlVatTpCd(String slVatTpCd) {
		this.slVatTpCd = slVatTpCd;
	}

	public Date getSlsCnfmDtm() {
		return this.slsCnfmDtm;
	}

	public void setSlsCnfmDtm(Date slsCnfmDtm) {
		this.slsCnfmDtm = slsCnfmDtm;
	}

	public Date getSpcPrdOrdHngDtm() {
		return this.spcPrdOrdHngDtm;
	}

	public void setSpcPrdOrdHngDtm(Date spcPrdOrdHngDtm) {
		this.spcPrdOrdHngDtm = spcPrdOrdHngDtm;
	}

	public String getSpcPrdOrdHngTpCd() {
		return this.spcPrdOrdHngTpCd;
	}

	public void setSpcPrdOrdHngTpCd(String spcPrdOrdHngTpCd) {
		this.spcPrdOrdHngTpCd = spcPrdOrdHngTpCd;
	}

	public String getSrgnId() {
		return this.srgnId;
	}

	public void setSrgnId(String srgnId) {
		this.srgnId = srgnId;
	}

	public String getStkoPtrTpCd() {
		return this.stkoPtrTpCd;
	}

	public void setStkoPtrTpCd(String stkoPtrTpCd) {
		this.stkoPtrTpCd = stkoPtrTpCd;
	}

	public String getStkoWhNo() {
		return this.stkoWhNo;
	}

	public void setStkoWhNo(String stkoWhNo) {
		this.stkoWhNo = stkoWhNo;
	}

	public String getStkoWhPtrCd() {
		return this.stkoWhPtrCd;
	}

	public void setStkoWhPtrCd(String stkoWhPtrCd) {
		this.stkoWhPtrCd = stkoWhPtrCd;
	}

	public String getUntNm() {
		return this.untNm;
	}

	public void setUntNm(String untNm) {
		this.untNm = untNm;
	}

	public String getUntPrdId() {
		return this.untPrdId;
	}

	public void setUntPrdId(String untPrdId) {
		this.untPrdId = untPrdId;
	}

	public String getUntPrdNm() {
		return this.untPrdNm;
	}

	public void setUntPrdNm(String untPrdNm) {
		this.untPrdNm = untPrdNm;
	}

	public String getUntSeq() {
		return this.untSeq;
	}

	public void setUntSeq(String untSeq) {
		this.untSeq = untSeq;
	}

}