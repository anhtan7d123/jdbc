package com.example.learnspringday1;
import com.example.learnspringday1.service.UserService;
import com.example.learnspringday1.service.impl.UserServiceImpl;
import com.zaxxer.hikari.HikariDataSource;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootApplication
public class LearnSpringday1Application {
    public static void main(String[] args) throws SQLException {
        SpringApplication.run(LearnSpringday1Application.class, args);
//        Connection connection = HikariCPConfigDatasource.getinstance().getConnection();
//        System.out.println(connection);
    }

//    @Autowired
//    private DataSource dataSource;
//
//    @PostConstruct
//    public void testConnection() {
//        try (Connection conn = dataSource.getConnection()) {
//            System.out.println("Connected to Postgres database!");
//        } catch (SQLException ex) {
//            System.err.println("Failed to connect to Postgres database: " + ex.getMessage());
//        }
//    }
}
