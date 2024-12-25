package poly.service;

import poly.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class UserManager {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PolyOE");
    EntityManager em = emf.createEntityManager();

    public void findAll() {
        String jpql = "SELECT u FROM User u";
        TypedQuery<User> query = em.createQuery(jpql, User.class);
        List<User> users = query.getResultList();
        users.forEach(user -> {
            System.out.println(user.getFullname() + ": " + (user.getAdmin() ? "Admin" : "Staff"));
        });
    }

    public void getUsersByQuery() {
        String jpql = "SELECT u FROM User u where u.email like :search and u.admin = :role";
        TypedQuery<User> query = em.createQuery(jpql, User.class);
        query.setParameter("search", "%fpt.edu.vn");
        query.setParameter("role", false);
        List<User> users = query.getResultList();
        users.forEach(user -> {
            System.out.println(user.getFullname() + ": " + (user.getAdmin() ? "Admin" : "Staff"));
        });
    }

    public void getUsersByPage(int pageNo, int pageSize) {
        String jpql = "SELECT u FROM User u";
        TypedQuery<User> query = em.createQuery(jpql, User.class);
        query.setFirstResult((pageNo - 1) * pageSize);
        query.setMaxResults(pageSize);
        List<User> users = query.getResultList();
        users.forEach(user -> {
            System.out.println(user.getFullname() + ": " + (user.getAdmin() ? "Admin" : "Staff"));
        });
    }

    public void findById(String id) {
        User user = em.find(User.class, id);
        System.out.println(user.getFullname() + ": " + (user.getAdmin() ? "Admin" : "Staff"));
    }

    public void create(User user) {
        try {
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    public void update(String id, User newUser) {
        User user = em.find(User.class, id);
        user.setFullname(newUser.getFullname());
        user.setAdmin(newUser.getAdmin());
        user.setPassword(newUser.getPassword());
        user.setEmail(newUser.getEmail());
        try {
            em.getTransaction().begin();
            em.merge(user);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    public void delete(String id) {
        User user = em.find(User.class, id);
        try {
            em.getTransaction().begin();
            em.remove(user);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }
}
