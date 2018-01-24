package com.fsoft.template.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the PRD_CPN_CST_D database table.
 * 
 */
@Embeddable
public class CouponPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CPN_ID" , length = 15)
	private String cpnId;

	@Column(name="CPN_PRT_NO"  , length = 100)
	private String cpnPrtNo;

	public CouponPK() {
	}
	public String getCpnId() {
		return this.cpnId;
	}
	public void setCpnId(String cpnId) {
		this.cpnId = cpnId;
	}
	public String getCpnPrtNo() {
		return this.cpnPrtNo;
	}
	public void setCpnPrtNo(String cpnPrtNo) {
		this.cpnPrtNo = cpnPrtNo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CouponPK)) {
			return false;
		}
		CouponPK castOther = (CouponPK)other;
		return 
			this.cpnId.equals(castOther.cpnId)
			&& this.cpnPrtNo.equals(castOther.cpnPrtNo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cpnId.hashCode();
		hash = hash * prime + this.cpnPrtNo.hashCode();
		
		return hash;
	}
}