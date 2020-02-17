package com.banhang.entity1;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ChiTietSanPhamMapper implements RowMapper<ChiTietSanPham>{

	public ChiTietSanPham mapRow(ResultSet rs, int rowNum) throws SQLException {
		ChiTietSanPham chitietSP = new ChiTietSanPham();
		chitietSP.setMasanpham(rs.getInt("masanpham"));
		chitietSP.setTensanpham(rs.getString("tensanpham"));
		chitietSP.setSize(rs.getString("size"));
		chitietSP.setSoluong(rs.getInt("soluong"));
		chitietSP.setTenmau(rs.getString("tenmau"));
		return chitietSP;
	}
	
	
}
