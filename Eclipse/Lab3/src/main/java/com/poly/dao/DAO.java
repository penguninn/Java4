package com.poly.dao;

import java.io.Serializable;
import java.util.List;

public interface DAO<T, ID extends Serializable> {
    public void create(T entity);
    public void update(T entity);
    public void deleteByID(ID id);
    public List<T> findAll();
    public T  findByID(ID id);

}
