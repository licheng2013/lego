package com.example.springBootDemo.service;

import com.example.springBootDemo.dao.AdminMapper;
import com.example.springBootDemo.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminMapper dao;

    public Admin selectById(Integer id){
        return dao.selectById(id);
    }

    public Admin selectByLoginName(String name){
        return dao.selectByLoginName(name);
    }
}
