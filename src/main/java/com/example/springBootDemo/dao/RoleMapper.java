package com.example.springBootDemo.dao;

import com.example.springBootDemo.model.Role;

import java.util.List;

public interface RoleMapper {
    Role selectById(Integer id);

    List<Role> selectByAdminId(Integer adminId);
}
