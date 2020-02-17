package com.banhang.entity1;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class NhanVienMapper implements RowMapper<NhanVien>{

	public NhanVien mapRow(ResultSet rs, int rowNum) throws SQLException {
		NhanVien nhanvien = new NhanVien();
		nhanvien.setEmail(rs.getString("email"));
		nhanvien.setName(rs.getString("name"));
		nhanvien.setPassword(rs.getString("password"));
		nhanvien.setRepeatpassword(rs.getString("repeatpassword"));
		return nhanvien;
	}

}
