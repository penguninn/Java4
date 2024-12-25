package repo;

import entity.LoaiPhieuGiamGia;
import entity.PhieuGiamGia;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import utils.XJPA;

import java.util.List;

public class PhieuGiamGiaRepo {
    EntityManager em = XJPA.getEntityManager();

    public List<PhieuGiamGia> findAll() {
        return em.createQuery("select p from PhieuGiamGia p").getResultList();
    }

    public PhieuGiamGia findById(int id) {
        return em.find(PhieuGiamGia.class, id);
    }

    public void save(PhieuGiamGia p, int loaiPhieuId) {
        em.getTransaction().begin();
        LoaiPhieuGiamGia loaiPhieu = em.find(LoaiPhieuGiamGia.class, loaiPhieuId);
        p.setLoaiPhieu(loaiPhieu);
        em.merge(p);
        em.getTransaction().commit();
    }

    public void delete(int id) {
        em.getTransaction().begin();
        em.remove(findById(id));
        em.getTransaction().commit();
    }

    public void update(PhieuGiamGia p) {
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
    }

}
