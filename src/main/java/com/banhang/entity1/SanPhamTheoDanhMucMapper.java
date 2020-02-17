package com.banhang.entity1;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SanPhamTheoDanhMucMapper implements RowMapper<SanPhamTheoDanhMuc>{

	public SanPhamTheoDanhMuc mapRow(ResultSet rs, int rowNum) throws SQLException {
		SanPhamTheoDanhMuc sanphamDanhmuc = new SanPhamTheoDanhMuc();
		sanphamDanhmuc.setMadanhmuc(rs.getInt("madanhmuc"));
		sanphamDanhmuc.setGiatien(rs.getString("giatien"));
		sanphamDanhmuc.setHinhsanpham(rs.getString("hinhsanpham"));
		
		sanphamDanhmuc.setTensanpham(rs.getString("tensanpham"));
		return sanphamDanhmuc;
	}

}
