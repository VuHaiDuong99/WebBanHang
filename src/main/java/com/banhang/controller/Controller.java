package com.banhang.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.banhang.entity1.SanPham;
import com.banhang.service.ListDanhMucSanPham;
import com.banhang.service.NhanVienService;
import com.banhang.service.SanPhamService;

@org.springframework.stereotype.Controller

public class Controller {
	@Autowired
	SanPhamService sanphamservice;
	@Autowired
	ListDanhMucSanPham danhmuc;
	@Autowired
	NhanVienService nhanvienService;
	@RequestMapping(value="/")
	public String TrangChu (ModelMap model) {
		List<SanPham> list = new ArrayList<SanPham>();
	
		list = sanphamservice.DanhSachSanPham();
		model.addAttribute("sanpham",list);
		model.addAttribute("listDanhMuc", danhmuc.ListDanhMucSanPham());
		return "index";
	}
	@RequestMapping(value="/DangNhap")
	public String DangNhap(@RequestParam(value ="email") String email,
			@RequestParam(value ="password") String password,ModelMap model) {
		List<com.banhang.entity1.NhanVien> list = nhanvienService.LayNhanVien();
		
		int d=0;
		for(com.banhang.entity1.NhanVien nhanvien : list) {
			if(email.equals(nhanvien.getEmail())==true && password.equals(nhanvien.getPassword())== true) {
				d=1;	
			}
		}
		
		if(d==0) {
			
			return "redirect:/Sign_in";
		}
		else {
			return "redirect:/";
		}		
	
	}
	@RequestMapping(value="/Sign_up")
	public String DangKi(ModelMap model) {
		model.addAttribute("themUser",new com.banhang.entity1.NhanVien());
		return "DangKi";
	}
	@RequestMapping(value="/DangKi",method = RequestMethod.POST)
	public String DangKiUser(@ModelAttribute("themUser") @Valid com.banhang.entity1.NhanVien nhanvien,BindingResult result) {
		
		if(result.hasErrors()) {			
			return "redirect:/";
		}
		
			nhanvienService.ThemUser(nhanvien);
			return "ThanhCong";
		
		
	}
	@RequestMapping(value="/Sign_in")
	public String DangNhap() {
		return "DangNhap";
	}
	@RequestMapping(value="/Admin")
	public String Admin() {
		return "admin";
	}
	@RequestMapping(value="/NhanVien")
	public String NhanVien() {
		return "NhanVien";
	}
	
	
}
