package com.banhang.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.banhang.entity.Chucvu;
import com.banhang.entity1.ChucVu;
@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ChucVuDao {
	
	@Autowired
	JdbcTemplate JdbcTemplate;
	@Transactional
	public void insertChucVu(ChucVu chucVu) {
		String sql = "INSERT INTO chucVu (tenchucvu) VALUES (?)";
		JdbcTemplate.update(sql,chucVu.getTenchucvu());

	}
}
