package poly.daoImp;

import poly.dao.FavoriteDAO;
import poly.entity.Favorite;
import poly.utils.XJPA;
import jakarta.persistence.EntityManager;

import java.util.List;

public class FavoriteDaoImp implements FavoriteDAO {

    EntityManager em = XJPA.getEntityManager();

    @Override
    public void create(Favorite entity) {

    }

    @Override
    public void update(Favorite entity) {

    }

    @Override
    public void deleteByID(Long id) {

    }

    @Override
    public List<Favorite> findAll() {
        return em.createQuery("select u from Favorite u ", Favorite.class).getResultList();
    }

    @Override
    public Favorite findByID(Long id) {
        return em.find(Favorite.class, id);
    }
}
