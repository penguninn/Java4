package daoImp;

import entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

import dao.UserDAO;

public class UserDaoImpl implements UserDAO{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("polyoe");
    EntityManager em = emf.createEntityManager();

    @Override
    public void findAll() {
        String jpql = "SELECT u FROM User u";
        TypedQuery<User> query = em.createQuery(jpql, User.class);
        List<User> users = query.getResultList();
        users.forEach(user -> {
            System.out.println(user.getId() + " : " +  user.getFullname() + ": " + (user.getAdmin() ? "Admin" : "Staff") + " : " + user.getEmail() );
        });
    }

    @Override
    public void getUsersByQuery() {
        String jpql = "SELECT u FROM User u where u.email like :search and u.admin = :role";
        TypedQuery<User> query = em.createQuery(jpql, User.class);
        query.setParameter("search", "%fpt.edu.vn");
        query.setParameter("role", false);
        List<User> users = query.getResultList();
        users.forEach(user -> {
            System.out.println(user.getId() + " : " +  user.getFullname() + ": " + (user.getAdmin() ? "Admin" : "Staff") + " : " + user.getEmail() );
        });
    }
    @Override
    public void getUsersByPage(int pageNo, int pageSize) {
        String jpql = "SELECT u FROM User u";
        TypedQuery<User> query = em.createQuery(jpql, User.class);
        query.setFirstResult((pageNo - 1) * pageSize);
        query.setMaxResults(pageSize);
        List<User> users = query.getResultList();
        users.forEach(user -> {
            System.out.println(user.getId() + " : " +  user.getFullname() + ": " + (user.getAdmin() ? "Admin" : "Staff") + " : " + user.getEmail() );
        });
    }
    @Override
    public void findById(String id) {
        User user = em.find(User.class, id);
        System.out.println(user.getId() + " : " +  user.getFullname() + ": " + (user.getAdmin() ? "Admin" : "Staff") + " : " + user.getEmail() );
    }
    @Override
    public void create(User user) {
        try {
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }
    @Override
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

    @Override
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
