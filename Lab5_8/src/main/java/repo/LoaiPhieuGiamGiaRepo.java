package repo;

import entity.LoaiPhieuGiamGia;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import utils.XJPA;

import java.util.List;

public class LoaiPhieuGiamGiaRepo {
    EntityManager em = XJPA.getEntityManager();

    public List<LoaiPhieuGiamGia> findAll() {
        return em.createQuery("from LoaiPhieuGiamGia", LoaiPhieuGiamGia.class).getResultList();
    }

    public LoaiPhieuGiamGia findById(int id) {
        return em.find(LoaiPhieuGiamGia.class, id);
    }
}
