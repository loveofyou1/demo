package com.sun.demo.controller;

import com.sun.demo.domain.User;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    public User getUser() {
        User user = new User();
        user.setUserName("sun");
        user.setPassword("123");
        return user;
    }
}
