package com.poly.dao;

import com.poly.entity.TieuPham;

import java.util.List;

public interface TieuPhamDao {
    public List<TieuPham> getAllTieuPham(int pageNo, int pageSize);
    public List<TieuPham> getTop10TieuPham();
    public TieuPham getTieuPhamById(int id);
    public void addTieuPham(TieuPham tieuPham);
    public void updateTieuPham(TieuPham tieuPham);
    public void deleteTieuPham(int id);
    int getTotalItems();
}
