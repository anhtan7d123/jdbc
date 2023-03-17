//package com.example.learnspringday1.configuration;
//
//import com.example.learnspringday1.service.UserService;
//import com.example.learnspringday1.service.impl.UserServiceImpl;
//import org.apache.commons.dbcp2.BasicDataSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import javax.annotation.PostConstruct;
//import javax.sql.DataSource;
//import java.sql.Connection;
//import java.sql.SQLException;
//
//import static com.example.learnspringday1.constant.JdbcConstant.*;
//
//@Configuration
////@ComponentScan("com.example.learnspringday1")
//public class JdbcConfig {
//    @Bean
//    public BasicDataSource postgresDataSource(){
//        BasicDataSource ds = new BasicDataSource();
//        ds.setDriverClassName(DB_DRIVER);
//        ds.setUrl(CONNECTION_URL);
//        ds.setUsername(USER_NAME);
//        ds.setPassword(PASSWORD);
//        ds.setMinIdle(DB_MIN_CONNECTIONS); // minimum number of idle connections in the pool
//        ds.setInitialSize(DB_MIN_CONNECTIONS);
//        ds.setMaxIdle(DB_MAX_CONNECTIONS); // maximum number of idle connections in the pool
//        ds.setMaxOpenPreparedStatements(100);
//        return ds;
//    }
//    @Bean
//    public UserService userService(){
//        return new UserServiceImpl(postgresDataSource());
//    }
//}
