package com.example.learnspringday1.configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.SQLException;

import static com.example.learnspringday1.constant.JdbcConstant.*;

//@Configuration
public class HikariCPConfigDatasource {
    private static HikariDataSource ds;

    static {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName(DB_DRIVER);
        config.setJdbcUrl(CONNECTION_URL);
        config.setUsername(USER_NAME);
        config.setPassword(PASSWORD);
        config.setMinimumIdle(DB_MIN_CONNECTIONS);
        config.setMaximumPoolSize(DB_MAX_CONNECTIONS);
        ds = new HikariDataSource(config);
    }

    private HikariCPConfigDatasource(){

    }

    public static HikariDataSource getinstance() throws SQLException {
        return ds;
    }
    public Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}
