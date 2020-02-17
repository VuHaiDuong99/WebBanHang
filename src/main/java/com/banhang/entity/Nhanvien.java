package com.banhang.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the nhanvien database table.
 * 
 */
@Entity
@NamedQuery(name="Nhanvien.findAll", query="SELECT n FROM Nhanvien n")
public class Nhanvien implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int manhanvien;

	private String cmnd;

	private String diachi;

	private String email;

	private String gioitinh;

	private String hoten;

	private String matkhau;

	private String tendangnhap;

	//bi-directional many-to-one association to Chucvu
	@ManyToOne
	@JoinColumn(name="machucvu")
	private Chucvu chucvu;

	public Nhanvien() {
	}

	public int getManhanvien() {
		return this.manhanvien;
	}

	public void setManhanvien(int manhanvien) {
		this.manhanvien = manhanvien;
	}

	public String getCmnd() {
		return this.cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public String getDiachi() {
		return this.diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGioitinh() {
		return this.gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public String getHoten() {
		return this.hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getMatkhau() {
		return this.matkhau;
	}

	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}

	public String getTendangnhap() {
		return this.tendangnhap;
	}

	public void setTendangnhap(String tendangnhap) {
		this.tendangnhap = tendangnhap;
	}

	public Chucvu getChucvu() {
		return this.chucvu;
	}

	public void setChucvu(Chucvu chucvu) {
		this.chucvu = chucvu;
	}

}