
package com.banhang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.banhang.entity1.SanPham;
import com.banhang.service.ChiTietSanPhamService;
import com.banhang.service.ListDanhMucSanPham;
import com.banhang.service.SanPhamService;

@Controller
public class ChiTietSanPhamController {
	@Autowired
	ChiTietSanPhamService chitietSanPham;
	@Autowired
	ListDanhMucSanPham listDanhMuc;

	@RequestMapping(value = "/ChiTietSanPham/{masanpham}")
	public String ChiTietSanPham1(@PathVariable int masanpham,ModelMap model) {
		SanPham sanpham;
		sanpham = chitietSanPham.ChiTietSanPham(masanpham);
		model.addAttribute("listChiTiet",sanpham);
		List list = chitietSanPham.ChiTiet(masanpham);
		model.addAttribute("listDanhMuc",listDanhMuc.ListDanhMucSanPham());
		model.addAttribute("ChiTiet1",list );
		return "ChiTietSanPham";
	}
	@RequestMapping(value = "//SanPham/{madanhmuc}")
	public String SanPhamTheoDanhMuc(@PathVariable int madanhmuc, ModelMap model) {
		model.addAttribute("sanphamDanhMuc", listDanhMuc.SanPhamDanhMuc(madanhmuc));
		model.addAttribute("listDanhMuc",listDanhMuc.ListDanhMucSanPham());
		return "DanhMucSanPham";
	}
}
