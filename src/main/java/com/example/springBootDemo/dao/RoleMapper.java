package com.example.springBootDemo.dao;

import com.example.springBootDemo.model.Role;

public interface RoleMapper {
    Role selectById(Integer id);
}
