package com.banhang.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.banhang.dao.ChiTietSanPhamDAO;
import com.banhang.entity1.SanPham;

@Service
public class ChiTietSanPhamService {
	@Autowired
	ChiTietSanPhamDAO chitietSP;
	@Transactional
	public SanPham ChiTietSanPham(int masanpham) {
		
		return  (SanPham) chitietSP.ChiTietSanPham(masanpham);
		
		
		
	}
	@Transactional
	public List ChiTiet(int masanpham) {
		return chitietSP.ChiTiet(masanpham);
	}
}
