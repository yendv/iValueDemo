package com.fsoft.template.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the ORD_ORD_DSN_H database table.
 * 
 */
@Entity
@Table(name="ORD_ORD_DSN_H")
public class OrderDiscount implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderDiscountPK id;

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

	@Column(name="DSN_AMT")
	private BigDecimal dsnAmt;

	@Column(name="DSN_AP_CST_GD_CD")
	private String dsnApCstGdCd;

	@Temporal(TemporalType.DATE)
	@Column(name="DSN_AP_DTM")
	private Date dsnApDtm;

	@Column(name="DSN_AP_EMP_NO")
	private String dsnApEmpNo;

	@Column(name="DSN_RSN_RLTD_ID")
	private String dsnRsnRltdId;

	@Column(name="DSN_RSN_TP_CD")
	private String dsnRsnTpCd;

	@Column(name="DSN_RT_AMT")
	private BigDecimal dsnRtAmt;

	@Column(name="DSN_RT_AMT_TP_CD")
	private String dsnRtAmtTpCd;

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

	@Column(name="SHOP_BRN_AMT")
	private BigDecimal shopBrnAmt;

	@Column(name="SHOP_BRN_RT_AMT")
	private BigDecimal shopBrnRtAmt;

	@Column(name="SHOP_BRN_RT_AMT_TP_CD")
	private String shopBrnRtAmtTpCd;

	@Column(name="TM_ID_DSN_AP_TM_ID")
	private String tmIdDsnApTmId;

	public OrderDiscount() {
	}

	public OrderDiscountPK getId() {
		return this.id;
	}

	public void setId(OrderDiscountPK id) {
		this.id = id;
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

	public BigDecimal getDsnAmt() {
		return this.dsnAmt;
	}

	public void setDsnAmt(BigDecimal dsnAmt) {
		this.dsnAmt = dsnAmt;
	}

	public String getDsnApCstGdCd() {
		return this.dsnApCstGdCd;
	}

	public void setDsnApCstGdCd(String dsnApCstGdCd) {
		this.dsnApCstGdCd = dsnApCstGdCd;
	}

	public Date getDsnApDtm() {
		return this.dsnApDtm;
	}

	public void setDsnApDtm(Date dsnApDtm) {
		this.dsnApDtm = dsnApDtm;
	}

	public String getDsnApEmpNo() {
		return this.dsnApEmpNo;
	}

	public void setDsnApEmpNo(String dsnApEmpNo) {
		this.dsnApEmpNo = dsnApEmpNo;
	}

	public String getDsnRsnRltdId() {
		return this.dsnRsnRltdId;
	}

	public void setDsnRsnRltdId(String dsnRsnRltdId) {
		this.dsnRsnRltdId = dsnRsnRltdId;
	}

	public String getDsnRsnTpCd() {
		return this.dsnRsnTpCd;
	}

	public void setDsnRsnTpCd(String dsnRsnTpCd) {
		this.dsnRsnTpCd = dsnRsnTpCd;
	}

	public BigDecimal getDsnRtAmt() {
		return this.dsnRtAmt;
	}

	public void setDsnRtAmt(BigDecimal dsnRtAmt) {
		this.dsnRtAmt = dsnRtAmt;
	}

	public String getDsnRtAmtTpCd() {
		return this.dsnRtAmtTpCd;
	}

	public void setDsnRtAmtTpCd(String dsnRtAmtTpCd) {
		this.dsnRtAmtTpCd = dsnRtAmtTpCd;
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

	public String getTmIdDsnApTmId() {
		return this.tmIdDsnApTmId;
	}

	public void setTmIdDsnApTmId(String tmIdDsnApTmId) {
		this.tmIdDsnApTmId = tmIdDsnApTmId;
	}

}