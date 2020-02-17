package com.banhang.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banhang.dao.ChucVuDao;
import com.banhang.entity.Chucvu;
import com.banhang.entity1.ChucVu;

@Service
public class ChucVuService {
	@Autowired
	ChucVuDao chucVuDao;
	@Transactional
	public void insertChucVu(ChucVu chucVu) {
		chucVuDao.insertChucVu(chucVu);
	}
}
