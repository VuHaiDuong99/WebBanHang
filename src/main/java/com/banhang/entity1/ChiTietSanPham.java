package com.banhang.entity1;

public class ChiTietSanPham {
	private int masanpham;
	private String tensanpham;
	private String tenmau;
	private String size;
	private int soluong;
	public ChiTietSanPham(String tensanpham, String tenmau, String size, int soluong,int masanpham) {
		super();
		this.tensanpham = tensanpham;
		this.tenmau = tenmau;
		this.size = size;
		this.soluong = soluong;
		this.masanpham = masanpham;
	}
	public ChiTietSanPham() {
		super();
	}
	
	public int getMasanpham() {
		return masanpham;
	}
	public void setMasanpham(int masanpham) {
		this.masanpham = masanpham;
	}
	public String getTensanpham() {
		return tensanpham;
	}
	public void setTensanpham(String tensanpham) {
		this.tensanpham = tensanpham;
	}
	public String getTenmau() {
		return tenmau;
	}
	public void setTenmau(String tenmau) {
		this.tenmau = tenmau;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	
}
