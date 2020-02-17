package com.banhang.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banhang.dao.NhanVienDao;
import com.banhang.entity1.NhanVien;

@Service
public class NhanVienService {
	@Autowired
	NhanVienDao nhanvienDao;
	@Transactional
	public List LayNhanVien() {
	return	nhanvienDao.LayNhanVien();
	}
	@Transactional
	public void ThemUser(NhanVien nhanvien) {
		nhanvienDao.ThemUser(nhanvien);
	}
	
}
