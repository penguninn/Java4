package com.poly.daoImp;

import com.poly.dao.UserDAO;
import com.poly.entity.User;
import com.poly.utils.XJPA;
import jakarta.persistence.EntityManager;

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
}
