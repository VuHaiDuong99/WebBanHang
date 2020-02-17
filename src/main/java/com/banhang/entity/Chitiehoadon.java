package com.banhang.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the chitiehoadon database table.
 * 
 */
@Entity
@NamedQuery(name="Chitiehoadon.findAll", query="SELECT c FROM Chitiehoadon c")
public class Chitiehoadon implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ChitiehoadonPK id;

	private String giatien;

	private int soluong;

	//bi-directional many-to-one association to Chitietsanpham
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="machitietsanpham", insertable=false, updatable=false)
	private Chitietsanpham chitietsanpham;

	//bi-directional many-to-one association to Hoadon
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="mahoadon", insertable=false, updatable=false)
	private Hoadon hoadon;

	public Chitiehoadon() {
	}

	public ChitiehoadonPK getId() {
		return this.id;
	}

	public void setId(ChitiehoadonPK id) {
		this.id = id;
	}

	public String getGiatien() {
		return this.giatien;
	}

	public void setGiatien(String giatien) {
		this.giatien = giatien;
	}

	public int getSoluong() {
		return this.soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public Chitietsanpham getChitietsanpham() {
		return this.chitietsanpham;
	}

	public void setChitietsanpham(Chitietsanpham chitietsanpham) {
		this.chitietsanpham = chitietsanpham;
	}

	public Hoadon getHoadon() {
		return this.hoadon;
	}

	public void setHoadon(Hoadon hoadon) {
		this.hoadon = hoadon;
	}

}