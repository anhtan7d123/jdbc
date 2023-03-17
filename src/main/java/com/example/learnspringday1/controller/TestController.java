package com.example.learnspringday1.controller;

import com.example.learnspringday1.entity.User;
import com.example.learnspringday1.service.UserService;
import com.example.learnspringday1.service.impl.UserServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@AllArgsConstructor
@Slf4j
public class TestController {

//    @Autowired
//    private UserService userService;
//
//    @GetMapping("/test")
//    public void testQuery() throws SQLException {
//        System.out.println(userService.get(User.class, 1));
//    }
}
