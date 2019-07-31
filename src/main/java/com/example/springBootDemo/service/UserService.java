package com.example.springBootDemo.service;

import com.example.springBootDemo.dao.UserMapper;
import com.example.springBootDemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper dao;

    public User selectById(Integer id){
        return dao.selectById(id);
    }

    public User selectByName(String name){
        return dao.selectByName(name);
    }
}
