package com.example.learnspringday1.service.base.impl;

import com.example.learnspringday1.service.base.BaseDao;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.List;


public class BaseDaoImpl<T> implements BaseDao<T> {
    private final BasicDataSource dataSource;

    public BaseDaoImpl(BasicDataSource dataSource){
        this.dataSource = dataSource;
    }

//    @Override
//    public T get(Class<T> clazz, Integer id) {
//        String tableName = clazz.getSimpleName().toLowerCase() + "s";
//        String sql = "SELECT * FROM " + tableName + " WHERE id = ?";
//        return jdbcTemplate.queryForObject(sql, new Object[] { id }, new RowMapper<T>() {
//            @Override
//            public T mapRow(ResultSet resultSet, int i) throws SQLException {
//                try {
//                    T instance = clazz.newInstance();
//                    ResultSetMetaData metaData = resultSet.getMetaData();
//                    int columnCount = metaData.getColumnCount();
//                    for (int index = 1; index <= columnCount; index++) {
//                        String columnLabel = metaData.getColumnLabel(index);
//                        Field field = clazz.getDeclaredField(columnLabel);
//                        field.setAccessible(true);
//                        field.set(instance, resultSet.getObject(columnLabel));
//                    }
//                    return instance;
//                } catch (Exception ex) {
//                    throw new RuntimeException(ex);
//                }
//            }
//        });
//    }

    @Override
    public T get(Class<T> clazz, Integer id) throws SQLException {
        String tableName = clazz.getSimpleName().toLowerCase() + "s";
        String sql = "SELECT * FROM " + tableName + " WHERE id = " + id;
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            System.out.println(resultSet.getString("id") + " " + resultSet.getString("username"));
        }
        return null;
    }

    @Override
    public List<T> getAll() {
        return null;
    }

    @Override
    public void save(T t) {

    }

    @Override
    public void update(T t, String[] params) {

    }

    @Override
    public void delete(T t) {

    }
}
