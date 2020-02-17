package com.banhang.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the chucvu database table.
 * 
 */
@Entity
@NamedQuery(name="Chucvu.findAll", query="SELECT c FROM Chucvu c")
public class Chucvu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int machucvu;

	private String tenchucvu;

	//bi-directional many-to-one association to Nhanvien
	@OneToMany(mappedBy="chucvu")
	private List<Nhanvien> nhanviens;

	public Chucvu() {
	}

	public int getMachucvu() {
		return this.machucvu;
	}

	public void setMachucvu(int machucvu) {
		this.machucvu = machucvu;
	}

	public String getTenchucvu() {
		return this.tenchucvu;
	}

	public void setTenchucvu(String tenchucvu) {
		this.tenchucvu = tenchucvu;
	}

	public List<Nhanvien> getNhanviens() {
		return this.nhanviens;
	}

	public void setNhanviens(List<Nhanvien> nhanviens) {
		this.nhanviens = nhanviens;
	}

	public Nhanvien addNhanvien(Nhanvien nhanvien) {
		getNhanviens().add(nhanvien);
		nhanvien.setChucvu(this);

		return nhanvien;
	}

	public Nhanvien removeNhanvien(Nhanvien nhanvien) {
		getNhanviens().remove(nhanvien);
		nhanvien.setChucvu(null);

		return nhanvien;
	}

}