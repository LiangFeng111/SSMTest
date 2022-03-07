package com.ssm.dao;

import com.ssm.entity.Liuyan;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface LiuYanDao {
    List<Liuyan> findAll();

}
