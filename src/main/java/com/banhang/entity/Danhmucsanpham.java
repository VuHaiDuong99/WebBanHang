package com.banhang.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the danhmucsanpham database table.
 * 
 */
@Entity
@NamedQuery(name="Danhmucsanpham.findAll", query="SELECT d FROM Danhmucsanpham d")
public class Danhmucsanpham implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int madanhmuc;

	@Lob
	private String hinhdanhmuc;

	private String tendanhmuc;

	//bi-directional many-to-one association to Sanpham
	@OneToMany(mappedBy="danhmucsanpham")
	private List<Sanpham> sanphams;

	public Danhmucsanpham() {
	}

	public int getMadanhmuc() {
		return this.madanhmuc;
	}

	public void setMadanhmuc(int madanhmuc) {
		this.madanhmuc = madanhmuc;
	}

	public String getHinhdanhmuc() {
		return this.hinhdanhmuc;
	}

	public void setHinhdanhmuc(String hinhdanhmuc) {
		this.hinhdanhmuc = hinhdanhmuc;
	}

	public String getTendanhmuc() {
		return this.tendanhmuc;
	}

	public void setTendanhmuc(String tendanhmuc) {
		this.tendanhmuc = tendanhmuc;
	}

	public List<Sanpham> getSanphams() {
		return this.sanphams;
	}

	public void setSanphams(List<Sanpham> sanphams) {
		this.sanphams = sanphams;
	}

	public Sanpham addSanpham(Sanpham sanpham) {
		getSanphams().add(sanpham);
		sanpham.setDanhmucsanpham(this);

		return sanpham;
	}

	public Sanpham removeSanpham(Sanpham sanpham) {
		getSanphams().remove(sanpham);
		sanpham.setDanhmucsanpham(null);

		return sanpham;
	}

}