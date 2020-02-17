package com.banhang.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the chitietsanpham database table.
 * 
 */
@Entity
@NamedQuery(name="Chitietsanpham.findAll", query="SELECT c FROM Chitietsanpham c")
public class Chitietsanpham implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private int machitietsanpham;
	private String ngaynhap;
	private int soluong;
	//bi-directional many-to-one association to Chitiehoadon
	@OneToMany(mappedBy="chitietsanpham")
	private List<Chitiehoadon> chitiehoadons;
	//bi-directional many-to-one association to Mausanpham
	@ManyToOne
	@JoinColumn(name="mamau")
	private Mausanpham mausanpham;

	//bi-directional many-to-one association to Sanpham
	@ManyToOne
	@JoinColumn(name="masanpham")
	private Sanpham sanpham;

	//bi-directional many-to-one association to Sizesanpham
	@ManyToOne
	@JoinColumn(name="masize")
	private Sizesanpham sizesanpham;

	public Chitietsanpham() {
	}
	public int getMachitietsanpham() {
		return this.machitietsanpham;
	}
	public void setMachitietsanpham(int machitietsanpham) {
		this.machitietsanpham = machitietsanpham;
	}
	public String getNgaynhap() {
		return this.ngaynhap;
	}
	public void setNgaynhap(String ngaynhap) {
		this.ngaynhap = ngaynhap;
	}
	public int getSoluong() {
		return this.soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public List<Chitiehoadon> getChitiehoadons() {
		return this.chitiehoadons;
	}
	public void setChitiehoadons(List<Chitiehoadon> chitiehoadons) {
		this.chitiehoadons = chitiehoadons;
	}
	public Chitiehoadon addChitiehoadon(Chitiehoadon chitiehoadon) {
		getChitiehoadons().add(chitiehoadon);
		chitiehoadon.setChitietsanpham(this);

		return chitiehoadon;
	}

	public Chitiehoadon removeChitiehoadon(Chitiehoadon chitiehoadon) {
		getChitiehoadons().remove(chitiehoadon);
		chitiehoadon.setChitietsanpham(null);

		return chitiehoadon;
	}

	public Mausanpham getMausanpham() {
		return this.mausanpham;
	}

	public void setMausanpham(Mausanpham mausanpham) {
		this.mausanpham = mausanpham;
	}

	public Sanpham getSanpham() {
		return this.sanpham;
	}

	public void setSanpham(Sanpham sanpham) {
		this.sanpham = sanpham;
	}

	public Sizesanpham getSizesanpham() {
		return this.sizesanpham;
	}

	public void setSizesanpham(Sizesanpham sizesanpham) {
		this.sizesanpham = sizesanpham;
	}

}