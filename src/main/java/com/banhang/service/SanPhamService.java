package com.banhang.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banhang.dao.SanPhamDao;
import com.banhang.entity.Sanpham;
import com.banhang.entity1.SanPham;

@Service
public class SanPhamService {
	@Autowired
	SanPhamDao sanphamdao;
	public List<SanPham> DanhSachSanPham(){
		
		return  sanphamdao.DanhSachSanPham();
	
		
		
	}
	
}
