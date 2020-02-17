package com.banhang.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the hoadon database table.
 * 
 */
@Entity
@NamedQuery(name="Hoadon.findAll", query="SELECT h FROM Hoadon h")
public class Hoadon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int mahoadon;

	private String diachigiaohang;

	private String ngaylap;

	private String sodt;

	private String tenkhachhang;

	private byte tinhtrang;

	//bi-directional many-to-one association to Chitiehoadon
	@OneToMany(mappedBy="hoadon")
	private List<Chitiehoadon> chitiehoadons;

	public Hoadon() {
	}

	public int getMahoadon() {
		return this.mahoadon;
	}

	public void setMahoadon(int mahoadon) {
		this.mahoadon = mahoadon;
	}

	public String getDiachigiaohang() {
		return this.diachigiaohang;
	}

	public void setDiachigiaohang(String diachigiaohang) {
		this.diachigiaohang = diachigiaohang;
	}

	public String getNgaylap() {
		return this.ngaylap;
	}

	public void setNgaylap(String ngaylap) {
		this.ngaylap = ngaylap;
	}

	public String getSodt() {
		return this.sodt;
	}

	public void setSodt(String sodt) {
		this.sodt = sodt;
	}

	public String getTenkhachhang() {
		return this.tenkhachhang;
	}

	public void setTenkhachhang(String tenkhachhang) {
		this.tenkhachhang = tenkhachhang;
	}

	public byte getTinhtrang() {
		return this.tinhtrang;
	}

	public void setTinhtrang(byte tinhtrang) {
		this.tinhtrang = tinhtrang;
	}

	public List<Chitiehoadon> getChitiehoadons() {
		return this.chitiehoadons;
	}

	public void setChitiehoadons(List<Chitiehoadon> chitiehoadons) {
		this.chitiehoadons = chitiehoadons;
	}

	public Chitiehoadon addChitiehoadon(Chitiehoadon chitiehoadon) {
		getChitiehoadons().add(chitiehoadon);
		chitiehoadon.setHoadon(this);

		return chitiehoadon;
	}

	public Chitiehoadon removeChitiehoadon(Chitiehoadon chitiehoadon) {
		getChitiehoadons().remove(chitiehoadon);
		chitiehoadon.setHoadon(null);

		return chitiehoadon;
	}

}