package com.ssm.service.impl;

import com.ssm.dao.UserDao;
import com.ssm.entity.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    public UserDao dao;

    @Override
    public List<User> findAll() {
        return dao.findAll();
    }

    @Override
    public List<User> findByName(String name) {
        return dao.findByName(name);
    }


}
