package com.banhang.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the chitietkhuyenmai database table.
 * 
 */
@Entity
@NamedQuery(name="Chitietkhuyenmai.findAll", query="SELECT c FROM Chitietkhuyenmai c")
public class Chitietkhuyenmai implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ChitietkhuyenmaiPK id;

	private int giagiam;

	//bi-directional many-to-one association to Sanpham
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="masanpham", insertable=false, updatable=false)
	private Sanpham sanpham;

	//bi-directional many-to-one association to Khuyenmai
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="makhuyenmai", insertable=false, updatable=false)
	private Khuyenmai khuyenmai;

	public Chitietkhuyenmai() {
	}

	public ChitietkhuyenmaiPK getId() {
		return this.id;
	}

	public void setId(ChitietkhuyenmaiPK id) {
		this.id = id;
	}

	public int getGiagiam() {
		return this.giagiam;
	}

	public void setGiagiam(int giagiam) {
		this.giagiam = giagiam;
	}

	public Sanpham getSanpham() {
		return this.sanpham;
	}

	public void setSanpham(Sanpham sanpham) {
		this.sanpham = sanpham;
	}

	public Khuyenmai getKhuyenmai() {
		return this.khuyenmai;
	}

	public void setKhuyenmai(Khuyenmai khuyenmai) {
		this.khuyenmai = khuyenmai;
	}

}