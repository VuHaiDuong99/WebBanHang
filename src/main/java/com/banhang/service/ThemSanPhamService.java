package com.banhang.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banhang.dao.ThemSanPhamDao;
import com.banhang.entity.Sanpham;
import com.banhang.entity1.SanPham;
import com.banhang.model.SanphamDTO;

@Service

public class ThemSanPhamService {
	@Autowired
	ThemSanPhamDao themSanPhamDao;
	
	@Transactional
	public void ThemSanPham(SanPham sanpham) {
		themSanPhamDao.ThemSanPham(sanpham);
	}
}
