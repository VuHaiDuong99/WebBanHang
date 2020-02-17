package com.banhang.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banhang.dao.SizeSanPhamDao;

@Service
public class SizeSanPhamService {
	@Autowired
	SizeSanPhamDao sizeSanPhamDao;
	@Transactional
	public List SizeSanPham() {
		List list = sizeSanPhamDao.LaySizeSanPham();
		return list;
	}

}
