package com.fsoft.template.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the ORD_ORD_PN_H database table.
 * 
 */
@Entity
@Table(name="GSHS.ORD_ORD_PN_H")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ORD_ID")
	private String id;

	@Column(name="CPN_NO")
	private String cpnNo;

	@Column(name="DLR_BRN_AMT")
	private BigDecimal dlrBrnAmt;

	@Column(name="DLR_BRN_RT_AMT")
	private BigDecimal dlrBrnRtAmt;

	@Column(name="DLR_BRN_RT_AMT_TP_CD")
	private String dlrBrnRtAmtTpCd;

	@Column(name="DLR_BRN_YN")
	private String dlrBrnYn;

	@Temporal(TemporalType.DATE)
	@Column(name="INST_DTM")
	private Date instDtm;

	@Column(name="INST_ID")
	private String instId;

	@Temporal(TemporalType.DATE)
	@Column(name="MDF_DTM")
	private Date mdfDtm;

	@Column(name="MDF_ID")
	private String mdfId;

	@Column(name="PN_AMT")
	private BigDecimal pnAmt;

	@Temporal(TemporalType.DATE)
	@Column(name="PN_AMT_LS_INST_DTM")
	private Date pnAmtLsInstDtm;

	@Column(name="PN_ARR_AMT")
	private BigDecimal pnArrAmt;

	@Column(name="PN_RSN_RLTD_ID")
	private String pnRsnRltdId;

	@Column(name="PN_RSN_TP_CD")
	private String pnRsnTpCd;

	@Column(name="PN_RT_AMT")
	private BigDecimal pnRtAmt;

	@Column(name="PN_RT_AMT_TP_CD")
	private String pnRtAmtTpCd;

	@Column(name="PN_USE_DUR_TP_CD")
	private String pnUseDurTpCd;

	@Column(name="SHOP_BRN_AMT")
	private BigDecimal shopBrnAmt;

	@Column(name="SHOP_BRN_RT_AMT")
	private BigDecimal shopBrnRtAmt;

	@Column(name="SHOP_BRN_RT_AMT_TP_CD")
	private String shopBrnRtAmtTpCd;

	@Column(name="USE_YN")
	private String useYn;

	public Order() {
	}

	public String getCpnNo() {
		return this.cpnNo;
	}

	public void setCpnNo(String cpnNo) {
		this.cpnNo = cpnNo;
	}

	public BigDecimal getDlrBrnAmt() {
		return this.dlrBrnAmt;
	}

	public void setDlrBrnAmt(BigDecimal dlrBrnAmt) {
		this.dlrBrnAmt = dlrBrnAmt;
	}

	public BigDecimal getDlrBrnRtAmt() {
		return this.dlrBrnRtAmt;
	}

	public void setDlrBrnRtAmt(BigDecimal dlrBrnRtAmt) {
		this.dlrBrnRtAmt = dlrBrnRtAmt;
	}

	public String getDlrBrnRtAmtTpCd() {
		return this.dlrBrnRtAmtTpCd;
	}

	public void setDlrBrnRtAmtTpCd(String dlrBrnRtAmtTpCd) {
		this.dlrBrnRtAmtTpCd = dlrBrnRtAmtTpCd;
	}

	public String getDlrBrnYn() {
		return this.dlrBrnYn;
	}

	public void setDlrBrnYn(String dlrBrnYn) {
		this.dlrBrnYn = dlrBrnYn;
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

	public BigDecimal getPnAmt() {
		return this.pnAmt;
	}

	public void setPnAmt(BigDecimal pnAmt) {
		this.pnAmt = pnAmt;
	}

	public Date getPnAmtLsInstDtm() {
		return this.pnAmtLsInstDtm;
	}

	public void setPnAmtLsInstDtm(Date pnAmtLsInstDtm) {
		this.pnAmtLsInstDtm = pnAmtLsInstDtm;
	}

	public BigDecimal getPnArrAmt() {
		return this.pnArrAmt;
	}

	public void setPnArrAmt(BigDecimal pnArrAmt) {
		this.pnArrAmt = pnArrAmt;
	}

	public String getPnRsnRltdId() {
		return this.pnRsnRltdId;
	}

	public void setPnRsnRltdId(String pnRsnRltdId) {
		this.pnRsnRltdId = pnRsnRltdId;
	}

	public String getPnRsnTpCd() {
		return this.pnRsnTpCd;
	}

	public void setPnRsnTpCd(String pnRsnTpCd) {
		this.pnRsnTpCd = pnRsnTpCd;
	}

	public BigDecimal getPnRtAmt() {
		return this.pnRtAmt;
	}

	public void setPnRtAmt(BigDecimal pnRtAmt) {
		this.pnRtAmt = pnRtAmt;
	}

	public String getPnRtAmtTpCd() {
		return this.pnRtAmtTpCd;
	}

	public void setPnRtAmtTpCd(String pnRtAmtTpCd) {
		this.pnRtAmtTpCd = pnRtAmtTpCd;
	}

	public String getPnUseDurTpCd() {
		return this.pnUseDurTpCd;
	}

	public void setPnUseDurTpCd(String pnUseDurTpCd) {
		this.pnUseDurTpCd = pnUseDurTpCd;
	}

	public BigDecimal getShopBrnAmt() {
		return this.shopBrnAmt;
	}

	public void setShopBrnAmt(BigDecimal shopBrnAmt) {
		this.shopBrnAmt = shopBrnAmt;
	}

	public BigDecimal getShopBrnRtAmt() {
		return this.shopBrnRtAmt;
	}

	public void setShopBrnRtAmt(BigDecimal shopBrnRtAmt) {
		this.shopBrnRtAmt = shopBrnRtAmt;
	}

	public String getShopBrnRtAmtTpCd() {
		return this.shopBrnRtAmtTpCd;
	}

	public void setShopBrnRtAmtTpCd(String shopBrnRtAmtTpCd) {
		this.shopBrnRtAmtTpCd = shopBrnRtAmtTpCd;
	}

	public String getUseYn() {
		return this.useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Order other = (Order) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}