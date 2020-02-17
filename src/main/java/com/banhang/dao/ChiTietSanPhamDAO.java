package com.banhang.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.banhang.entity1.ChiTietSanPhamMapper;
import com.banhang.entity1.SanPham;
import com.banhang.entity1.SanPhamMapper;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ChiTietSanPhamDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	@Transactional
	public SanPham ChiTietSanPham(int masanpham) {	
		String sql ="select * from sanpham where masanpham = ?";
		return (SanPham) jdbcTemplate.queryForObject(sql, new SanPhamMapper(), masanpham);	 
	}
	@Transactional
	public List ChiTiet(int masanpham) {
		String sql ="select sanpham.tensanpham , tenmau,size,soluong,sanpham.masanpham from sanpham,chitietsanpham,mausanpham,sizesanpham where sanpham.masanpham = chitietsanpham.masanpham\r\n" + 
				" and mausanpham.mamau = chitietsanpham.mamau and sizesanpham.masize = chitietsanpham.masize and sanpham.masanpham= "+masanpham;
		 return  jdbcTemplate.query(sql, new ChiTietSanPhamMapper());
                
	}
	
}
