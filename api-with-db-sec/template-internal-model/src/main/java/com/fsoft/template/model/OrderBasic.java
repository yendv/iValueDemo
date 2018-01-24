package com.fsoft.template.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the ORD_ORD_BSC_M database table.
 * 
 */
@Entity
@Table(name="GSHS.ORD_ORD_BSC_M")
public class OrderBasic implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ORD_ID")
	private String ordId;

	@Column(name="ACCF_ID")
	private String accfId;

	@Column(name="ACCF_PAY_ACN_NO")
	private String accfPayAcnNo;

	
	@Column(name="ACCF_PAY_ARR_DTM")
	private Date accfPayArrDtm;

	@Column(name="ACCF_PAY_BN_ID")
	private String accfPayBnId;

	
	@Column(name="ACCF_PAY_DTM")
	private Date accfPayDtm;

	@Column(name="ACCF_PAY_RMTR")
	private String accfPayRmtr;

	@Column(name="AMT_PN_AP_YN")
	private String amtPnApYn;

	@Column(name="AMT_PN_CLL_AMT")
	private BigDecimal amtPnCllAmt;

	@Column(name="AMT_PN_OTK_AMT")
	private BigDecimal amtPnOtkAmt;

	@Column(name="AMT_PN_OTK_ARR_AMT")
	private BigDecimal amtPnOtkArrAmt;

	
	@Column(name="AMT_PN_OTK_DTM")
	private Date amtPnOtkDtm;

	@Column(name="AMT_PN_PMT_ID")
	private String amtPnPmtId;

	@Column(name="BFR_ORD_ID")
	private String bfrOrdId;

	@Column(name="CST_ID")
	private String cstId;

	@Column(name="DLVF_DSN_CPN_ID")
	private String dlvfDsnCpnId;

	@Column(name="DLVF_DSN_CPN_NO")
	private String dlvfDsnCpnNo;

	
	@Column(name="INST_DTM")
	private Date instDtm;

	@Column(name="INST_ID")
	private String instId;

	
	@Column(name="MDF_DTM")
	private Date mdfDtm;

	@Column(name="MDF_ID")
	private String mdfId;

	@Column(name="ORD_BSC_STS_CD")
	private String ordBscStsCd;

	
	@Column(name="ORD_BSC_STS_DTM")
	private Date ordBscStsDtm;

	@Column(name="ORD_INFLX_PT_CD")
	private String ordInflxPtCd;

	@Column(name="ORD_PTR_CD")
	private String ordPtrCd;

	
	@Column(name="ORD_WR_DTM")
	private Date ordWrDtm;

	@Column(name="ORD_WR_TP_CD")
	private String ordWrTpCd;

	@Column(name="ORG_ORD_ID")
	private String orgOrdId;

	
	@Column(name="PG_APV_DTM")
	private Date pgApvDtm;

	
	@Column(name="PG_INTT_ORD_HNG_DTM")
	private Date pgInttOrdHngDtm;

	@Column(name="PG_INTT_ORD_HNG_TP_CD")
	private String pgInttOrdHngTpCd;

	@Column(name="PG_PAY_DPST_RFN_YN")
	private String pgPayDpstRfnYn;

	@Column(name="PG_PAY_ID")
	private String pgPayId;

	@Column(name="PSTM_DST_ARR_DTM")
	private Date pstmDstArrDtm;

	@Column(name="PSTM_ID")
	private String pstmId;

	@Column(name="PSTM_PAY_DTM")
	private Date pstmPayDtm;

	@Column(name="PSTM_RCV_ADDR_ID")
	private String pstmRcvAddrId;

	@Column(name="PSTM_RMTR")
	private String pstmRmtr;

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ordId == null) ? 0 : ordId.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderBasic other = (OrderBasic) obj;
		if (ordId == null) {
			if (other.ordId != null)
				return false;
		} else if (!ordId.equals(other.ordId))
			return false;
		return true;
	}

	public OrderBasic() {
	}

	public String getOrdId() {
		return this.ordId;
	}

	public void setOrdId(String ordId) {
		this.ordId = ordId;
	}

	public String getAccfId() {
		return this.accfId;
	}

	public void setAccfId(String accfId) {
		this.accfId = accfId;
	}

	public String getAccfPayAcnNo() {
		return this.accfPayAcnNo;
	}

	public void setAccfPayAcnNo(String accfPayAcnNo) {
		this.accfPayAcnNo = accfPayAcnNo;
	}

	public Date getAccfPayArrDtm() {
		return this.accfPayArrDtm;
	}

	public void setAccfPayArrDtm(Date accfPayArrDtm) {
		this.accfPayArrDtm = accfPayArrDtm;
	}

	public String getAccfPayBnId() {
		return this.accfPayBnId;
	}

	public void setAccfPayBnId(String accfPayBnId) {
		this.accfPayBnId = accfPayBnId;
	}

	public Date getAccfPayDtm() {
		return this.accfPayDtm;
	}

	public void setAccfPayDtm(Date accfPayDtm) {
		this.accfPayDtm = accfPayDtm;
	}

	public String getAccfPayRmtr() {
		return this.accfPayRmtr;
	}

	public void setAccfPayRmtr(String accfPayRmtr) {
		this.accfPayRmtr = accfPayRmtr;
	}

	public String getAmtPnApYn() {
		return this.amtPnApYn;
	}

	public void setAmtPnApYn(String amtPnApYn) {
		this.amtPnApYn = amtPnApYn;
	}

	public BigDecimal getAmtPnCllAmt() {
		return this.amtPnCllAmt;
	}

	public void setAmtPnCllAmt(BigDecimal amtPnCllAmt) {
		this.amtPnCllAmt = amtPnCllAmt;
	}

	public BigDecimal getAmtPnOtkAmt() {
		return this.amtPnOtkAmt;
	}

	public void setAmtPnOtkAmt(BigDecimal amtPnOtkAmt) {
		this.amtPnOtkAmt = amtPnOtkAmt;
	}

	public BigDecimal getAmtPnOtkArrAmt() {
		return this.amtPnOtkArrAmt;
	}

	public void setAmtPnOtkArrAmt(BigDecimal amtPnOtkArrAmt) {
		this.amtPnOtkArrAmt = amtPnOtkArrAmt;
	}

	public Date getAmtPnOtkDtm() {
		return this.amtPnOtkDtm;
	}

	public void setAmtPnOtkDtm(Date amtPnOtkDtm) {
		this.amtPnOtkDtm = amtPnOtkDtm;
	}

	public String getAmtPnPmtId() {
		return this.amtPnPmtId;
	}

	public void setAmtPnPmtId(String amtPnPmtId) {
		this.amtPnPmtId = amtPnPmtId;
	}

	public String getBfrOrdId() {
		return this.bfrOrdId;
	}

	public void setBfrOrdId(String bfrOrdId) {
		this.bfrOrdId = bfrOrdId;
	}

	public String getCstId() {
		return this.cstId;
	}

	public void setCstId(String cstId) {
		this.cstId = cstId;
	}

	public String getDlvfDsnCpnId() {
		return this.dlvfDsnCpnId;
	}

	public void setDlvfDsnCpnId(String dlvfDsnCpnId) {
		this.dlvfDsnCpnId = dlvfDsnCpnId;
	}

	public String getDlvfDsnCpnNo() {
		return this.dlvfDsnCpnNo;
	}

	public void setDlvfDsnCpnNo(String dlvfDsnCpnNo) {
		this.dlvfDsnCpnNo = dlvfDsnCpnNo;
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

	public String getOrdBscStsCd() {
		return this.ordBscStsCd;
	}

	public void setOrdBscStsCd(String ordBscStsCd) {
		this.ordBscStsCd = ordBscStsCd;
	}

	public Date getOrdBscStsDtm() {
		return this.ordBscStsDtm;
	}

	public void setOrdBscStsDtm(Date ordBscStsDtm) {
		this.ordBscStsDtm = ordBscStsDtm;
	}

	public String getOrdInflxPtCd() {
		return this.ordInflxPtCd;
	}

	public void setOrdInflxPtCd(String ordInflxPtCd) {
		this.ordInflxPtCd = ordInflxPtCd;
	}

	public String getOrdPtrCd() {
		return this.ordPtrCd;
	}

	public void setOrdPtrCd(String ordPtrCd) {
		this.ordPtrCd = ordPtrCd;
	}

	public Date getOrdWrDtm() {
		return this.ordWrDtm;
	}

	public void setOrdWrDtm(Date ordWrDtm) {
		this.ordWrDtm = ordWrDtm;
	}

	public String getOrdWrTpCd() {
		return this.ordWrTpCd;
	}

	public void setOrdWrTpCd(String ordWrTpCd) {
		this.ordWrTpCd = ordWrTpCd;
	}

	public String getOrgOrdId() {
		return this.orgOrdId;
	}

	public void setOrgOrdId(String orgOrdId) {
		this.orgOrdId = orgOrdId;
	}

	public Date getPgApvDtm() {
		return this.pgApvDtm;
	}

	public void setPgApvDtm(Date pgApvDtm) {
		this.pgApvDtm = pgApvDtm;
	}

	public Date getPgInttOrdHngDtm() {
		return this.pgInttOrdHngDtm;
	}

	public void setPgInttOrdHngDtm(Date pgInttOrdHngDtm) {
		this.pgInttOrdHngDtm = pgInttOrdHngDtm;
	}

	public String getPgInttOrdHngTpCd() {
		return this.pgInttOrdHngTpCd;
	}

	public void setPgInttOrdHngTpCd(String pgInttOrdHngTpCd) {
		this.pgInttOrdHngTpCd = pgInttOrdHngTpCd;
	}

	public String getPgPayDpstRfnYn() {
		return this.pgPayDpstRfnYn;
	}

	public void setPgPayDpstRfnYn(String pgPayDpstRfnYn) {
		this.pgPayDpstRfnYn = pgPayDpstRfnYn;
	}

	public String getPgPayId() {
		return this.pgPayId;
	}

	public void setPgPayId(String pgPayId) {
		this.pgPayId = pgPayId;
	}

	public Date getPstmDstArrDtm() {
		return this.pstmDstArrDtm;
	}

	public void setPstmDstArrDtm(Date pstmDstArrDtm) {
		this.pstmDstArrDtm = pstmDstArrDtm;
	}

	public String getPstmId() {
		return this.pstmId;
	}

	public void setPstmId(String pstmId) {
		this.pstmId = pstmId;
	}

	public Date getPstmPayDtm() {
		return this.pstmPayDtm;
	}

	public void setPstmPayDtm(Date pstmPayDtm) {
		this.pstmPayDtm = pstmPayDtm;
	}

	public String getPstmRcvAddrId() {
		return this.pstmRcvAddrId;
	}

	public void setPstmRcvAddrId(String pstmRcvAddrId) {
		this.pstmRcvAddrId = pstmRcvAddrId;
	}

	public String getPstmRmtr() {
		return this.pstmRmtr;
	}

	public void setPstmRmtr(String pstmRmtr) {
		this.pstmRmtr = pstmRmtr;
	}

}