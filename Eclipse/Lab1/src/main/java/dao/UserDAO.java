package dao;

import entity.User;

public interface UserDAO {
	public void findAll();
	public void getUsersByQuery();
	public void getUsersByPage(int pageNo, int pageSize);
	public void findById(String id);
	public void create(User user);
	public void update(String id, User newUser);
	public void delete(String id);
	
}