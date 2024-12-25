package com.poly;

import java.util.List;

import com.poly.dao.TieuPhamDao;
import com.poly.daoImpl.TieuPhamDaoImpl;
import com.poly.entity.TieuPham;
import com.poly.utils.XJPA;

import jakarta.persistence.EntityManager;

public class Main {
	public static void main(String[] args) {
		TieuPhamDao dao = new TieuPhamDaoImpl();
		for (TieuPham tp : dao.getAllTieuPham(1, 5)) {
			System.out.println(tp.isTrangThai());
		}
	}
}