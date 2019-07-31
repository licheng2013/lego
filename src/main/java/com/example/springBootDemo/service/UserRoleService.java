package com.example.springBootDemo.service;

import com.example.springBootDemo.dao.UserRoleMapper;
import com.example.springBootDemo.model.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleService {
    @Autowired
    private UserRoleMapper dao;

    public List<UserRole> selectByUserId(Integer userId){
        return dao.selectByUserId(userId);
    }
}
