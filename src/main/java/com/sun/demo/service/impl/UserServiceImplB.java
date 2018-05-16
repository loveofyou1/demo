package com.sun.demo.service.impl;

import com.sun.demo.domain.User;
import com.sun.demo.service.IUserService;
import org.springframework.stereotype.Service;

@Service("serviceB")
public class UserServiceImplB implements IUserService {
    @Override
    public int addNewUser(User user) {
        return 1;
    }
}
