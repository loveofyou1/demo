package com.sun.demo.service.impl;

import com.sun.demo.domain.User;
import com.sun.demo.service.IUserService;
import org.springframework.stereotype.Service;

@Service("service")
public class UserServiceImpl implements IUserService {
    @Override
    public int addNewUser(User user) {
        return 0;
    }
}
