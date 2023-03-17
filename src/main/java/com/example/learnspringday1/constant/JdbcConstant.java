package com.example.learnspringday1.constant;

public class JdbcConstant {
    public static final String HOST_NAME = "localhost";
    public static final String DB_NAME = "jdbc";
    public static final String DB_PORT = "5432";
    public static final String USER_NAME = "postgres";
    public static final String PASSWORD = "05042001aA";
    public static final String DB_DRIVER = "org.postgresql.Driver";
    public static final int DB_MIN_CONNECTIONS = 2;
    public static final int DB_MAX_CONNECTIONS = 4;
    public static final String CONNECTION_URL = "jdbc:postgresql://" + HOST_NAME + ":" + DB_PORT + "/" + DB_NAME;
}
