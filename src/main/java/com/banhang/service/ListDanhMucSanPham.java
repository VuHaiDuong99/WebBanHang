package com.banhang.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banhang.dao.ListDanhMucSP;
import com.banhang.entity1.DanhMucSanPham;
import com.banhang.entity1.SanPhamTheoDanhMuc;

@Service
public class ListDanhMucSanPham {
	@Autowired
	ListDanhMucSP listDanhMuc;

	@Transactional
	public List<DanhMucSanPham> ListDanhMucSanPham() {

		return listDanhMuc.ListDanhMucSP();
	}
	@Transactional
	public List SanPhamDanhMuc (int madanhmuc) {
		return listDanhMuc.SanPhamTheoDanhMuc(madanhmuc);
	}

}
