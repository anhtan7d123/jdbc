package com.example.learnspringday1.service.base;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface BaseDao<T> {
    T get(Class<T> clazz, Integer id) throws SQLException;

    List<T> getAll();

    void save(T t);

    void update(T t, String[] params);

    void delete(T t);

}
