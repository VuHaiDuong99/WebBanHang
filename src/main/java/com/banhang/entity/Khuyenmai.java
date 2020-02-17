package com.banhang.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the khuyenmai database table.
 * 
 */
@Entity
@NamedQuery(name="Khuyenmai.findAll", query="SELECT k FROM Khuyenmai k")
public class Khuyenmai implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int makhuyenmai;

	@Lob
	private String hinhkhuyenmai;

	@Lob
	private String mota;

	private String tenkhuyenmai;

	private String thoigianbatdau;

	private String thoigianketthuc;

	//bi-directional many-to-one association to Chitietkhuyenmai
	@OneToMany(mappedBy="khuyenmai")
	private List<Chitietkhuyenmai> chitietkhuyenmais;

	public Khuyenmai() {
	}

	public int getMakhuyenmai() {
		return this.makhuyenmai;
	}

	public void setMakhuyenmai(int makhuyenmai) {
		this.makhuyenmai = makhuyenmai;
	}

	public String getHinhkhuyenmai() {
		return this.hinhkhuyenmai;
	}

	public void setHinhkhuyenmai(String hinhkhuyenmai) {
		this.hinhkhuyenmai = hinhkhuyenmai;
	}

	public String getMota() {
		return this.mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public String getTenkhuyenmai() {
		return this.tenkhuyenmai;
	}

	public void setTenkhuyenmai(String tenkhuyenmai) {
		this.tenkhuyenmai = tenkhuyenmai;
	}

	public String getThoigianbatdau() {
		return this.thoigianbatdau;
	}

	public void setThoigianbatdau(String thoigianbatdau) {
		this.thoigianbatdau = thoigianbatdau;
	}

	public String getThoigianketthuc() {
		return this.thoigianketthuc;
	}

	public void setThoigianketthuc(String thoigianketthuc) {
		this.thoigianketthuc = thoigianketthuc;
	}

	public List<Chitietkhuyenmai> getChitietkhuyenmais() {
		return this.chitietkhuyenmais;
	}

	public void setChitietkhuyenmais(List<Chitietkhuyenmai> chitietkhuyenmais) {
		this.chitietkhuyenmais = chitietkhuyenmais;
	}

	public Chitietkhuyenmai addChitietkhuyenmai(Chitietkhuyenmai chitietkhuyenmai) {
		getChitietkhuyenmais().add(chitietkhuyenmai);
		chitietkhuyenmai.setKhuyenmai(this);

		return chitietkhuyenmai;
	}

	public Chitietkhuyenmai removeChitietkhuyenmai(Chitietkhuyenmai chitietkhuyenmai) {
		getChitietkhuyenmais().remove(chitietkhuyenmai);
		chitietkhuyenmai.setKhuyenmai(null);

		return chitietkhuyenmai;
	}

}