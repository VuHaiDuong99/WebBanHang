package com.banhang.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sanpham database table.
 * 
 */
@Entity
@Table(name="sanpham")
public class Sanpham implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int masanpham;

	private String gianhcho;
	
	private int madanhmuc;

	private String giatien;

	@Lob
	private String hinhsanpham;

	@Lob
	private String mota;

	private String tensanpham;

	//bi-directional many-to-one association to Chitietkhuyenmai
	@OneToMany(mappedBy="sanpham")
	private List<Chitietkhuyenmai> chitietkhuyenmais;

	//bi-directional many-to-one association to Chitietsanpham
	@OneToMany(mappedBy="sanpham")
	private List<Chitietsanpham> chitietsanphams;

	//bi-directional many-to-one association to Danhmucsanpham
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="madanhmuc",referencedColumnName = "madanhmuc", insertable = false, updatable = false)
	private Danhmucsanpham danhmucsanpham;

	public Sanpham() {
	}

	public int getMasanpham() {
		return this.masanpham;
	}

	public void setMasanpham(int masanpham) {
		this.masanpham = masanpham;
	}

	public String getGianhcho() {
		return this.gianhcho;
	}

	public void setGianhcho(String gianhcho) {
		this.gianhcho = gianhcho;
	}

	public String getGiatien() {
		return this.giatien;
	}

	public void setGiatien(String giatien) {
		this.giatien = giatien;
	}

	public String getHinhsanpham() {
		return this.hinhsanpham;
	}

	public void setHinhsanpham(String hinhsanpham) {
		this.hinhsanpham = hinhsanpham;
	}

	public String getMota() {
		return this.mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public String getTensanpham() {
		return this.tensanpham;
	}

	public void setTensanpham(String tensanpham) {
		this.tensanpham = tensanpham;
	}

	public List<Chitietkhuyenmai> getChitietkhuyenmais() {
		return this.chitietkhuyenmais;
	}

	public void setChitietkhuyenmais(List<Chitietkhuyenmai> chitietkhuyenmais) {
		this.chitietkhuyenmais = chitietkhuyenmais;
	}

	public Chitietkhuyenmai addChitietkhuyenmai(Chitietkhuyenmai chitietkhuyenmai) {
		getChitietkhuyenmais().add(chitietkhuyenmai);
		chitietkhuyenmai.setSanpham(this);

		return chitietkhuyenmai;
	}

	public Chitietkhuyenmai removeChitietkhuyenmai(Chitietkhuyenmai chitietkhuyenmai) {
		getChitietkhuyenmais().remove(chitietkhuyenmai);
		chitietkhuyenmai.setSanpham(null);

		return chitietkhuyenmai;
	}

	public List<Chitietsanpham> getChitietsanphams() {
		return this.chitietsanphams;
	}

	public void setChitietsanphams(List<Chitietsanpham> chitietsanphams) {
		this.chitietsanphams = chitietsanphams;
	}

	public Chitietsanpham addChitietsanpham(Chitietsanpham chitietsanpham) {
		getChitietsanphams().add(chitietsanpham);
		chitietsanpham.setSanpham(this);

		return chitietsanpham;
	}

	public Chitietsanpham removeChitietsanpham(Chitietsanpham chitietsanpham) {
		getChitietsanphams().remove(chitietsanpham);
		chitietsanpham.setSanpham(null);

		return chitietsanpham;
	}

	public Danhmucsanpham getDanhmucsanpham() {
		return this.danhmucsanpham;
	}

	public void setDanhmucsanpham(Danhmucsanpham danhmucsanpham) {
		this.danhmucsanpham = danhmucsanpham;
	}

}