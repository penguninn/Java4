package poly.daoImp;

import poly.dao.UserDAO;
import poly.entity.User;
import poly.utils.XJPA;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;

import java.util.List;

public class UserDaoImp implements UserDAO {

    EntityManager em = XJPA.getEntityManager();

    @Override
    public void create(User entity) {
        em.persist(entity);
    }

    @Override
    public void update(User entity) {
        em.merge(entity);
    }

    @Override
    public void deleteByID(String id) {
        em.remove(em.find(User.class, id));
    }

    @Override
    public List<User> findAll() {
        return em.createQuery("SELECT u FROM User u", User.class).getResultList();
    }

    @Override
    public User findByID(String id) {
        return em.createQuery("SELECT u FROM User u WHERE u.id = :id", User.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public User findByIdOrEmail(String str) {
        try {
            return em.createQuery("select u from User u where u.id = :id or u.email like :email", User.class)
                    .setParameter("id", str)
                    .setParameter("email", "%" + str + "%")
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }



}
