package poly.dao;

import poly.entity.User;

public interface UserDAO extends DAO<User, String> {
    public User findByIdOrEmail(String str);
}
