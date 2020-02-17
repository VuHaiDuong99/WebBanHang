package com.banhang.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banhang.dao.MauSanPhamDao;

@Service
public class MauSanPhamService {
	@Autowired
	MauSanPhamDao mauSanPhamDao;
	@Transactional
	public List MauSanPham() {
		List list = mauSanPhamDao.MauSanPham();
		return list;
	}
}
