package com.example.springBootDemo.dao;

import com.example.springBootDemo.model.User;

public interface UserMapper {
    User selectById(Integer id);

    User selectByName(String name);
}
