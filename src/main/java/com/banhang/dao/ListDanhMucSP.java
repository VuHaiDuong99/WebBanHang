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

import com.banhang.entity.Danhmucsanpham;
import com.banhang.entity1.DanhMucSanPham;
import com.banhang.entity1.DanhMucSanPhamMapper;
import com.banhang.entity1.SanPhamTheoDanhMuc;
import com.banhang.entity1.SanPhamTheoDanhMucMapper;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ListDanhMucSP {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Transactional
	public List<DanhMucSanPham> ListDanhMucSP(){
		String sql ="select *from danhmucsanpham";
		return jdbcTemplate.query(sql, new DanhMucSanPhamMapper());
	}
	@Transactional
	public List SanPhamTheoDanhMuc(int madanhmuc) {
		String sql ="select sanpham.madanhmuc, tensanpham,hinhsanpham ,giatien from sanpham, danhmucsanpham where "
				+ "sanpham.madanhmuc = danhmucsanpham.madanhmuc and sanpham.madanhmuc = " + madanhmuc ;
		return jdbcTemplate.query(sql , new SanPhamTheoDanhMucMapper());
	}
	

}
