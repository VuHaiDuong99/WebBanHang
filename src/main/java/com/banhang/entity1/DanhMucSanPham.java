package com.banhang.entity1;

import javax.persistence.Lob;

public class DanhMucSanPham {
	private int madanhmuc;

	
	private String hinhdanhmuc;

	private String tendanhmuc;

	public DanhMucSanPham() {
		super();
	}

	public DanhMucSanPham(int madanhmuc, String hinhdanhmuc, String tendanhmuc) {
		super();
		this.madanhmuc = madanhmuc;
		this.hinhdanhmuc = hinhdanhmuc;
		this.tendanhmuc = tendanhmuc;
	}

	public int getMadanhmuc() {
		return madanhmuc;
	}

	public void setMadanhmuc(int madanhmuc) {
		this.madanhmuc = madanhmuc;
	}

	public String getHinhdanhmuc() {
		return hinhdanhmuc;
	}

	public void setHinhdanhmuc(String hinhdanhmuc) {
		this.hinhdanhmuc = hinhdanhmuc;
	}

	public String getTendanhmuc() {
		return tendanhmuc;
	}

	public void setTendanhmuc(String tendanhmuc) {
		this.tendanhmuc = tendanhmuc;
	}
	

}
