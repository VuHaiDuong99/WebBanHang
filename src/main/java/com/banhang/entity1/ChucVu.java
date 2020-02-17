package com.banhang.entity1;

public class ChucVu {
	private int machucvu;

	private String tenchucvu;
	
	public ChucVu() {
		super();
	}

	public ChucVu(int machucvu, String tenchucvu) {
		super();
		this.machucvu = machucvu;
		this.tenchucvu = tenchucvu;
	}

	public int getMachucvu() {
		return machucvu;
	}

	public void setMachucvu(int machucvu) {
		this.machucvu = machucvu;
	}

	public String getTenchucvu() {
		return tenchucvu;
	}

	public void setTenchucvu(String tenchucvu) {
		this.tenchucvu = tenchucvu;
	}
	
}
