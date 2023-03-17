package com.example.learnspringday1.test;

import com.example.learnspringday1.configuration.HiakriCPDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
//        String s1 = "abc";
//        String s2 = "abc";
//        String s3 = new String("abc");
//        StringBuilder sdb = new StringBuilder("Tan");
//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);
        try (Connection conn = HiakriCPDataSource.getInstance().getConnection()) {
            System.out.println("Connected to database!");
            System.out.println(conn);
            // Perform some queries to test the connection
        } catch (SQLException e) {
            System.out.println("Failed to connect to database!");
            e.printStackTrace();
        }
    }
}
