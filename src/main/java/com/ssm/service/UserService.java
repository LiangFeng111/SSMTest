package com.ssm.service;

import com.ssm.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    List<User> findByName(String name);
}
