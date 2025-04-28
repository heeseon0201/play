package com.hs.play.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    private String id;
    private String name;
    private String password;
    private String login_id;
    private String phone;
    private String email;
}
