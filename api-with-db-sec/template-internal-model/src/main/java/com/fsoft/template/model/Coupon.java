/**
 * 
 */
package com.fsoft.template.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.TemporalType;



/**
 * @author YenDV
 *
 */
@Entity
@Table(name = "GSHS.PRD_CPN_CST_D")
public class Coupon  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//@Id
	/*@SequenceGenerator(name = "BC_BAO_CAO_ID_GENERATOR", sequenceName = "BC_BAO_CAO_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BC_BAO_CAO_ID_GENERATOR")*/
	//@Column(name = "CPN_ID")
	@EmbeddedId
	private CouponPK id;
	
	/*@Column(name = "CPN_PRT_NO")
	private String couponIssueNumber;*/
	
	@Column(name = "CST_ID")
	private String customerId;
	
	@Column(name = "CPN_VLD_DUR_BGN_DTM")
	private Date cpnVldDurBgnDtm;//Coupon Validity Period Start date
	
	@Column(name = "CPN_VLD_DUR_CL_DTM")
	private Date cpnVldDurClDtm;//Coupon Expiration Date
	
	@Column(name = "TEMP_PRT_YN")
	private String discretionaryIssuance;
	
	@Column(name = "CPN_USE_YN")
	private String cpnUseYn;//Whether to use coupons
	
	@Column(name = "ORD_ID")
	private String orderId;
	
	@Column(name = "ORD_SEQ")
	private String orderSequence;
	
	@Column(name = "ORD_DTM")
	private java.sql.Date orderDate;
	
	@Column(name = "CPN_CST_INST_TP_CD")
	private String cpnCstInstTpCd;//Coupon Customer Registration Separator Code

	@Column(name = "USE_YN")
	private String userYn;//Whether to use

	@Column(name = "INST_ID")
	private String instId;//Registrar
	
	@Column(name = "INST_DTM")
	private String instDtm;//Registration date
	
	@Column(name = "MDF_ID")
	private String mdfId;//Modifier
	
	@javax.persistence.Temporal(TemporalType.DATE)
	@Column(name="MDF_DTM")
	private java.util.Date mdfDtm;//Modify Date
	
	@Column(name = "ISD_CPN_PRT_NO")
	private String isdCpnPrtNo;//Internal Coupon Issue Number

	/**
	 * @return the id
	 */
	public CouponPK getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(CouponPK id) {
		this.id = id;
	}

	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the cpnVldDurBgnDtm
	 */
	public Date getCpnVldDurBgnDtm() {
		return cpnVldDurBgnDtm;
	}

	/**
	 * @param cpnVldDurBgnDtm the cpnVldDurBgnDtm to set
	 */
	public void setCpnVldDurBgnDtm(Date cpnVldDurBgnDtm) {
		this.cpnVldDurBgnDtm = cpnVldDurBgnDtm;
	}

	/**
	 * @return the cpnVldDurClDtm
	 */
	public Date getCpnVldDurClDtm() {
		return cpnVldDurClDtm;
	}

	/**
	 * @param cpnVldDurClDtm the cpnVldDurClDtm to set
	 */
	public void setCpnVldDurClDtm(Date cpnVldDurClDtm) {
		this.cpnVldDurClDtm = cpnVldDurClDtm;
	}

	/**
	 * @return the discretionaryIssuance
	 */
	public String getDiscretionaryIssuance() {
		return discretionaryIssuance;
	}

	/**
	 * @param discretionaryIssuance the discretionaryIssuance to set
	 */
	public void setDiscretionaryIssuance(String discretionaryIssuance) {
		this.discretionaryIssuance = discretionaryIssuance;
	}

	/**
	 * @return the cpnUseYn
	 */
	public String getCpnUseYn() {
		return cpnUseYn;
	}

	/**
	 * @param cpnUseYn the cpnUseYn to set
	 */
	public void setCpnUseYn(String cpnUseYn) {
		this.cpnUseYn = cpnUseYn;
	}

	/**
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the orderSequence
	 */
	public String getOrderSequence() {
		return orderSequence;
	}

	/**
	 * @param orderSequence the orderSequence to set
	 */
	public void setOrderSequence(String orderSequence) {
		this.orderSequence = orderSequence;
	}

	/**
	 * @return the orderDate
	 */
	public java.sql.Date getOrderDate() {
		return orderDate;
	}

	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(java.sql.Date orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * @return the cpnCstInstTpCd
	 */
	public String getCpnCstInstTpCd() {
		return cpnCstInstTpCd;
	}

	/**
	 * @param cpnCstInstTpCd the cpnCstInstTpCd to set
	 */
	public void setCpnCstInstTpCd(String cpnCstInstTpCd) {
		this.cpnCstInstTpCd = cpnCstInstTpCd;
	}

	/**
	 * @return the userYn
	 */
	public String getUserYn() {
		return userYn;
	}

	/**
	 * @param userYn the userYn to set
	 */
	public void setUserYn(String userYn) {
		this.userYn = userYn;
	}

	/**
	 * @return the instId
	 */
	public String getInstId() {
		return instId;
	}

	/**
	 * @param instId the instId to set
	 */
	public void setInstId(String instId) {
		this.instId = instId;
	}

	/**
	 * @return the instDtm
	 */
	public String getInstDtm() {
		return instDtm;
	}

	/**
	 * @param instDtm the instDtm to set
	 */
	public void setInstDtm(String instDtm) {
		this.instDtm = instDtm;
	}

	/**
	 * @return the mdfId
	 */
	public String getMdfId() {
		return mdfId;
	}

	/**
	 * @param mdfId the mdfId to set
	 */
	public void setMdfId(String mdfId) {
		this.mdfId = mdfId;
	}

	/**
	 * @return the mdfDtm
	 */
	public java.util.Date getMdfDtm() {
		return mdfDtm;
	}

	/**
	 * @param mdfDtm the mdfDtm to set
	 */
	public void setMdfDtm(java.util.Date mdfDtm) {
		this.mdfDtm = mdfDtm;
	}

	/**
	 * @return the isdCpnPrtNo
	 */
	public String getIsdCpnPrtNo() {
		return isdCpnPrtNo;
	}

	/**
	 * @param isdCpnPrtNo the isdCpnPrtNo to set
	 */
	public void setIsdCpnPrtNo(String isdCpnPrtNo) {
		this.isdCpnPrtNo = isdCpnPrtNo;
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
		Coupon other = (Coupon) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	/**
	 * 
	 */
	public Coupon() {
		super();
		// TODO Auto-generated constructor stub
	}
}
