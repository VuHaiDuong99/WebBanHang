package com.banhang.entity1;

public class SanPhamTheoDanhMuc {
	private int madanhmuc;
	private String hinhsanpham;
	private String tensanpham;
	private String giatien;
	public SanPhamTheoDanhMuc() {
		super();
	}
	public SanPhamTheoDanhMuc(int madanhmuc, String hinhsanpham, String tensanpham, String giatien) {
		super();
		this.madanhmuc = madanhmuc;
		this.hinhsanpham = hinhsanpham;
		this.tensanpham = tensanpham;
		this.giatien = giatien;
	}
	public int getMadanhmuc() {
		return madanhmuc;
	}
	public void setMadanhmuc(int madanhmuc) {
		this.madanhmuc = madanhmuc;
	}
	public String getHinhsanpham() {
		return hinhsanpham;
	}
	public void setHinhsanpham(String hinhsanpham) {
		this.hinhsanpham = hinhsanpham;
	}
	public String getTensanpham() {
		return tensanpham;
	}
	public void setTensanpham(String tensanpham) {
		this.tensanpham = tensanpham;
	}
	public String getGiatien() {
		return giatien;
	}
	public void setGiatien(String giatien) {
		this.giatien = giatien;
	}
	
}
