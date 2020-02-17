package com.banhang.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the chitietkhuyenmai database table.
 * 
 */
@Embeddable
public class ChitietkhuyenmaiPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int makhuyenmai;

	@Column(insertable=false, updatable=false)
	private int masanpham;

	public ChitietkhuyenmaiPK() {
	}
	public int getMakhuyenmai() {
		return this.makhuyenmai;
	}
	public void setMakhuyenmai(int makhuyenmai) {
		this.makhuyenmai = makhuyenmai;
	}
	public int getMasanpham() {
		return this.masanpham;
	}
	public void setMasanpham(int masanpham) {
		this.masanpham = masanpham;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ChitietkhuyenmaiPK)) {
			return false;
		}
		ChitietkhuyenmaiPK castOther = (ChitietkhuyenmaiPK)other;
		return 
			(this.makhuyenmai == castOther.makhuyenmai)
			&& (this.masanpham == castOther.masanpham);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.makhuyenmai;
		hash = hash * prime + this.masanpham;
		
		return hash;
	}
}