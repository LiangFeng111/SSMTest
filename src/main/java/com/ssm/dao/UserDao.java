package com.ssm.dao;

import com.ssm.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserDao {
    public List<User> findAll();
    List<User> findByName(@Param("names") String name);
}
