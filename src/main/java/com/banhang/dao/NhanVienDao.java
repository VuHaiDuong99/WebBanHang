package com.banhang.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.banhang.entity1.NhanVien;
import com.banhang.entity1.NhanVienMapper;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class NhanVienDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Transactional
	public List LayNhanVien() {
		String sql ="select * from user ";
		return (List) jdbcTemplate.query(sql, new NhanVienMapper());
	}
	@Transactional
	public void ThemUser(NhanVien nhanvien) {
		String sql ="insert into user(email,name,password,repeatpassword) values(?,?,?,?)";
		jdbcTemplate.update(sql, nhanvien.getEmail(),nhanvien.getName(),nhanvien.getPassword(),nhanvien.getRepeatpassword());
	}
}	
