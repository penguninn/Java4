package com.poly.daoImpl;

import com.poly.dao.TieuPhamDao;
import com.poly.entity.TieuPham;
import com.poly.utils.XJPA;
import jakarta.persistence.EntityManager;

import java.util.List;

public class TieuPhamDaoImpl implements TieuPhamDao {
    EntityManager em = XJPA.getEntityManager();

    @Override
    public List<TieuPham> getAllTieuPham(int pageNo, int pageSize) {
        return em.createQuery("select t from TieuPham t", TieuPham.class).
                setFirstResult((pageNo - 1) * pageSize).
                setMaxResults(pageSize).
                getResultList();
    }

    @Override
    public List<TieuPham> getTop10TieuPham() {
        return em.createQuery("SELECT t FROM TieuPham t ORDER BY t.ngayTao DESC", TieuPham.class)
                .setMaxResults(10)
                .getResultList();
    }

    @Override
    public TieuPham getTieuPhamById(int id) {
        return em.find(TieuPham.class, id);
    }

    @Override
    public void addTieuPham(TieuPham tieuPham) {
        try {
            em.getTransaction().begin();
            em.persist(tieuPham);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public void updateTieuPham(TieuPham tieuPham) {
        try {
            em.getTransaction().begin();
            em.merge(tieuPham);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public void deleteTieuPham(int id) {
        try {
            em.getTransaction().begin();
            em.remove(getTieuPhamById(id));
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    @Override
    public int getTotalItems() {
        Long count = em.createQuery("select count(t) from TieuPham t", Long.class).getSingleResult();
        return count != null ? count.intValue() : 0;
    }
}
