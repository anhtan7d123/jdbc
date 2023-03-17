package com.example.learnspringday1.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
public class User {
    @Id
    private Integer id;

    private String username;

    private String passwordd;

}
