package com.banhang.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.banhang.entity.Danhmucsanpham;
import com.banhang.entity.Sanpham;
import com.banhang.entity1.SanPham;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ThemSanPhamDao {
	@Autowired
	JdbcTemplate JdbcTemplate;
	
	@Transactional
	public void ThemSanPham(SanPham sanpham) {
		String sql = "INSERT INTO sanpham (madanhmuc,tensanpham,giatien,hinhsanpham,mota,gianhcho) VALUES (?,?,?,?,?,?)";
		JdbcTemplate.update(sql,sanpham.getMadanhmuc(),sanpham.getTensanpham(),sanpham.getGiatien(),
				sanpham.getHinhsanpham(),sanpham.getMota(),sanpham.getGianhcho());
	
	}
}
