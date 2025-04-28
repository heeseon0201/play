package com.hs.play.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RequestMapping("/user")
@RestController
public class UserController {

    @GetMapping("/users")
    private String getUsers() {
        return "Hello, World!";
    }
}
