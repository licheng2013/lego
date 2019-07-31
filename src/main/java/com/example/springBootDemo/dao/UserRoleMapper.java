package com.example.springBootDemo.dao;

import com.example.springBootDemo.model.UserRole;

import java.util.List;

public interface UserRoleMapper {
    List<UserRole> selectByUserId(Integer userId);
}
