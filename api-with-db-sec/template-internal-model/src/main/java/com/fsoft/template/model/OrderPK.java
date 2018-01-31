package com.fsoft.template.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ORD_ORD_PN_H database table.
 * 
 */
@Embeddable
public class OrderPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ORD_ID")
	private String ordId;

	@Column(name="ORD_SEQ")
	private String ordSeq;

	@Column(name="PN_SEQ")
	private String pnSeq;

	public OrderPK() {
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
	public String getPnSeq() {
		return this.pnSeq;
	}
	public void setPnSeq(String pnSeq) {
		this.pnSeq = pnSeq;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OrderPK)) {
			return false;
		}
		OrderPK castOther = (OrderPK)other;
		return 
			this.ordId.equals(castOther.ordId)
			&& this.ordSeq.equals(castOther.ordSeq)
			&& this.pnSeq.equals(castOther.pnSeq);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ordId.hashCode();
		hash = hash * prime + this.ordSeq.hashCode();
		hash = hash * prime + this.pnSeq.hashCode();
		
		return hash;
	}
}