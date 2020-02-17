package com.banhang.entity1;

import javax.validation.constraints.NotNull;

public class NhanVien {
	@NotNull(message = "Id may not be null")
	private String email;
	@NotNull(message = "Id may not be null")
	private String password;
	@NotNull(message = "Id may not be null")
	private String repeatpassword;
	@NotNull(message = "Id may not be null")
	private String name;
	public NhanVien(String email, String password, String repeatpassword, String name) {
		super();
		this.email = email;
		this.password = password;
		this.repeatpassword = repeatpassword;
		this.name = name;
	}
	public NhanVien() {
		super();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepeatpassword() {
		return repeatpassword;
	}
	public void setRepeatpassword(String repeatpassword) {
		this.repeatpassword = repeatpassword;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
