package com.sun.demo.controller;

import com.sun.demo.domain.User;
import com.sun.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Qualifier("service")
    @Autowired
    private IUserService userService;

    public User getUser() {
        User user = new User();
        user.setUserName("sun");
        user.setPassword("123");
        return user;
    }


    @RequestMapping("/")
    public User addUser() {
        User user = new User();
        user.setPassword("2");
        user.setUserName("lei");
        int update = userService.addNewUser(user);
        return user;
    }
}
