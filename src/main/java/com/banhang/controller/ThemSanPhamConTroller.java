package com.banhang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.banhang.entity.Chucvu;
import com.banhang.entity.Danhmucsanpham;
import com.banhang.entity.Sanpham;
import com.banhang.entity1.SanPham;
import com.banhang.service.ListDanhMucSanPham;
import com.banhang.service.MauSanPhamService;
import com.banhang.service.SizeSanPhamService;
import com.banhang.service.ThemSanPhamService;

@Controller

public class ThemSanPhamConTroller {
	@Autowired
	ThemSanPhamService sanPhamService;
	@Autowired
	ListDanhMucSanPham listDanhMuc;
	@Autowired
	SizeSanPhamService sizeSanPham;
	@Autowired
	MauSanPhamService mauSanPhamService;
	@Autowired
	ThemSanPhamService themSanPhamService;

	@RequestMapping(value = "/ThemSanPham")
	public String addSanPham(ModelMap model) {
		List list = listDanhMuc.ListDanhMucSanPham();
		model.addAttribute("listDanhMuc", list);
		List listSizeSanPham = sizeSanPham.SizeSanPham();
		List listMauSanPham = mauSanPhamService.MauSanPham();
		model.addAttribute("listSize", listSizeSanPham);
		model.addAttribute("listMau", listMauSanPham);
		model.addAttribute("insertSanPham", new SanPham());
		return "addSanPham";
	}
	
	
	  @RequestMapping(value="/XuLyThemSanPham",method=RequestMethod.POST) 
	  public
	  String XuLyThemSanPham(ModelMap model,@ModelAttribute("insertSanPham")
	  SanPham sanpham ) {
	  
	 
	  themSanPhamService.ThemSanPham(sanpham); 
	  return "ThanhCong";
	  
	  }
	 
	 

}
