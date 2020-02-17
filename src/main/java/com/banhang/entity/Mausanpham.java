package com.banhang.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the mausanpham database table.
 * 
 */
@Entity
@NamedQuery(name="Mausanpham.findAll", query="SELECT m FROM Mausanpham m")
public class Mausanpham implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int mamau;

	private String tenmau;

	//bi-directional many-to-one association to Chitietsanpham
	@OneToMany(mappedBy="mausanpham")
	private List<Chitietsanpham> chitietsanphams;

	public Mausanpham() {
	}

	public int getMamau() {
		return this.mamau;
	}

	public void setMamau(int mamau) {
		this.mamau = mamau;
	}

	public String getTenmau() {
		return this.tenmau;
	}

	public void setTenmau(String tenmau) {
		this.tenmau = tenmau;
	}

	public List<Chitietsanpham> getChitietsanphams() {
		return this.chitietsanphams;
	}

	public void setChitietsanphams(List<Chitietsanpham> chitietsanphams) {
		this.chitietsanphams = chitietsanphams;
	}

	public Chitietsanpham addChitietsanpham(Chitietsanpham chitietsanpham) {
		getChitietsanphams().add(chitietsanpham);
		chitietsanpham.setMausanpham(this);

		return chitietsanpham;
	}

	public Chitietsanpham removeChitietsanpham(Chitietsanpham chitietsanpham) {
		getChitietsanphams().remove(chitietsanpham);
		chitietsanpham.setMausanpham(null);

		return chitietsanpham;
	}

}