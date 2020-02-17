package com.banhang.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sizesanpham database table.
 * 
 */
@Entity
@NamedQuery(name="Sizesanpham.findAll", query="SELECT s FROM Sizesanpham s")
public class Sizesanpham implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int masize;

	private String size;

	//bi-directional many-to-one association to Chitietsanpham
	@OneToMany(mappedBy="sizesanpham")
	private List<Chitietsanpham> chitietsanphams;

	public Sizesanpham() {
	}

	public int getMasize() {
		return this.masize;
	}

	public void setMasize(int masize) {
		this.masize = masize;
	}

	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public List<Chitietsanpham> getChitietsanphams() {
		return this.chitietsanphams;
	}

	public void setChitietsanphams(List<Chitietsanpham> chitietsanphams) {
		this.chitietsanphams = chitietsanphams;
	}

	public Chitietsanpham addChitietsanpham(Chitietsanpham chitietsanpham) {
		getChitietsanphams().add(chitietsanpham);
		chitietsanpham.setSizesanpham(this);

		return chitietsanpham;
	}

	public Chitietsanpham removeChitietsanpham(Chitietsanpham chitietsanpham) {
		getChitietsanphams().remove(chitietsanpham);
		chitietsanpham.setSizesanpham(null);

		return chitietsanpham;
	}

}