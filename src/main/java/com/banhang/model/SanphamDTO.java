package com.banhang.model;

import javax.persistence.Lob;

public class SanphamDTO {
	private int masanpham;
	private String gianhcho;
	private String giatien;
	private String hinhsanpham;
	private String mota;
	private String tensanpham;
	
	public SanphamDTO() {
		super();
	}
	
	public SanphamDTO(int masanpham, String gianhcho, String giatien, String hinhsanpham, String mota,
			String tensanpham) {
		super();
		this.masanpham = masanpham;
		this.gianhcho = gianhcho;
		this.giatien = giatien;
		this.hinhsanpham = hinhsanpham;
		this.mota = mota;
		this.tensanpham = tensanpham;
	}

	public int getMasanpham() {
		return masanpham;
	}
	public void setMasanpham(int masanpham) {
		this.masanpham = masanpham;
	}
	public String getGianhcho() {
		return gianhcho;
	}
	public void setGianhcho(String gianhcho) {
		this.gianhcho = gianhcho;
	}
	public String getGiatien() {
		return giatien;
	}
	public void setGiatien(String giatien) {
		this.giatien = giatien;
	}
	public String getHinhsanpham() {
		return hinhsanpham;
	}
	public void setHinhsanpham(String hinhsanpham) {
		this.hinhsanpham = hinhsanpham;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	public String getTensanpham() {
		return tensanpham;
	}
	public void setTensanpham(String tensanpham) {
		this.tensanpham = tensanpham;
	}
	

}
