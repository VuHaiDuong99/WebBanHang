package com.banhang.entity1;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DanhMucSanPhamMapper implements RowMapper<DanhMucSanPham>	{

	public DanhMucSanPham mapRow(ResultSet rs, int rowNum) throws SQLException {
		DanhMucSanPham danhmucSP =new DanhMucSanPham();
		danhmucSP.setHinhdanhmuc(rs.getString("hinhdanhmuc"));
		danhmucSP.setMadanhmuc(rs.getInt("madanhmuc"));
		danhmucSP.setTendanhmuc(rs.getString("tendanhmuc"));
		return danhmucSP;
	}

}
