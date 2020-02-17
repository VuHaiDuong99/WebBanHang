package com.banhang.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import com.banhang.entity.Mausanpham;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class MauSanPhamDao {
	@Autowired
	SessionFactory sessionFactory;
	public List MauSanPham() {
		List list = new ArrayList<Mausanpham>();
		Session session = sessionFactory.getCurrentSession();
		String sql ="from Mausanpham";
		list = session.createQuery(sql).getResultList();
		return list;
	}
}
