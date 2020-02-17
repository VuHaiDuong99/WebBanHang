package com.banhang.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the chitiehoadon database table.
 * 
 */
@Embeddable
public class ChitiehoadonPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int mahoadon;

	@Column(insertable=false, updatable=false)
	private int machitietsanpham;

	public ChitiehoadonPK() {
	}
	public int getMahoadon() {
		return this.mahoadon;
	}
	public void setMahoadon(int mahoadon) {
		this.mahoadon = mahoadon;
	}
	public int getMachitietsanpham() {
		return this.machitietsanpham;
	}
	public void setMachitietsanpham(int machitietsanpham) {
		this.machitietsanpham = machitietsanpham;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ChitiehoadonPK)) {
			return false;
		}
		ChitiehoadonPK castOther = (ChitiehoadonPK)other;
		return 
			(this.mahoadon == castOther.mahoadon)
			&& (this.machitietsanpham == castOther.machitietsanpham);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.mahoadon;
		hash = hash * prime + this.machitietsanpham;
		
		return hash;
	}
}