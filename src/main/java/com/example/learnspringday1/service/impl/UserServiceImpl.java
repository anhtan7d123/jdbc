package com.example.learnspringday1.service.impl;

import com.example.learnspringday1.entity.User;
import com.example.learnspringday1.service.UserService;
import com.example.learnspringday1.service.base.impl.BaseDaoImpl;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

public class UserServiceImpl extends BaseDaoImpl<User> implements UserService {
    public UserServiceImpl(BasicDataSource dataSource) {
        super(dataSource);
    }
}
