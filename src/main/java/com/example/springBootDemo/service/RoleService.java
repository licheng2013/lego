package com.example.springBootDemo.service;

import com.example.springBootDemo.dao.RoleMapper;
import com.example.springBootDemo.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    private RoleMapper dao;

    public Role selectById(Integer id){
        return dao.selectById(id);
    }
}
