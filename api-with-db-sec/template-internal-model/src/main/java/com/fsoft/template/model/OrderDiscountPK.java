package com.fsoft.template.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ORD_ORD_DSN_H database table.
 * 
 */
@Embeddable
public class OrderDiscountPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ORD_ID")
	private String ordId;

	@Column(name="ORD_SEQ")
	private String ordSeq;

	@Column(name="DSN_SEQ")
	private String dsnSeq;

	public OrderDiscountPK() {
	}
	public String getOrdId() {
		return this.ordId;
	}
	public void setOrdId(String ordId) {
		this.ordId = ordId;
	}
	public String getOrdSeq() {
		return this.ordSeq;
	}
	public void setOrdSeq(String ordSeq) {
		this.ordSeq = ordSeq;
	}
	public String getDsnSeq() {
		return this.dsnSeq;
	}
	public void setDsnSeq(String dsnSeq) {
		this.dsnSeq = dsnSeq;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OrderDiscountPK)) {
			return false;
		}
		OrderDiscountPK castOther = (OrderDiscountPK)other;
		return 
			this.ordId.equals(castOther.ordId)
			&& this.ordSeq.equals(castOther.ordSeq)
			&& this.dsnSeq.equals(castOther.dsnSeq);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ordId.hashCode();
		hash = hash * prime + this.ordSeq.hashCode();
		hash = hash * prime + this.dsnSeq.hashCode();
		
		return hash;
	}
}