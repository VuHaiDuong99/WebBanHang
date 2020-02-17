package com.banhang.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.banhang.entity.Chitietsanpham;
import com.banhang.entity.Sanpham;
import com.banhang.entity1.SanPham;
import com.banhang.entity1.SanPhamMapper;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)

public class SanPhamDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	@Transactional
	public List<SanPham> DanhSachSanPham(){
	
		String sql ="select * from sanpham";
		return  jdbcTemplate.query(sql, new SanPhamMapper());
		
	}
	
	
}
