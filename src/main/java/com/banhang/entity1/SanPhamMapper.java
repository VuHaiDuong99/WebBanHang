package com.banhang.entity1;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SanPhamMapper implements RowMapper<SanPham> {
	public SanPham mapRow(ResultSet rs, int rowNum) throws SQLException {
		SanPham sanpham = new SanPham();
		sanpham.setMasanpham(rs.getInt("masanpham"));
		sanpham.setTensanpham(rs.getString("tensanpham"));
		sanpham.setGianhcho(rs.getString("gianhcho"));
		sanpham.setGiatien(rs.getString("giatien"));
		sanpham.setMadanhmuc(rs.getInt("madanhmuc"));
		sanpham.setHinhsanpham(rs.getString("hinhsanpham"));
		sanpham.setMota(rs.getString("mota"));

		return sanpham;
	}

}
