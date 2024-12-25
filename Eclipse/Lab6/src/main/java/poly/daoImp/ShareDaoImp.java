package poly.daoImp;

import poly.dao.ShareDAO;
import poly.entity.Share;
import poly.utils.XJPA;
import jakarta.persistence.EntityManager;

import java.util.List;

public class ShareDaoImp implements ShareDAO {
    EntityManager em = XJPA.getEntityManager();

    @Override
    public void create(Share entity) {

    }

    @Override
    public void update(Share entity) {

    }

    @Override
    public void deleteByID(Long id) {

    }

    @Override
    public List<Share> findAll() {
        return em.createQuery("from Share", Share.class).getResultList();
    }

    @Override
    public Share findByID(Long id) {
        return null;
    }
}
