package com.example.springBootDemo.service.impl;

import com.example.springBootDemo.dao.AdminMapper;
import com.example.springBootDemo.model.Admin;
import com.example.springBootDemo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper dao;

    @Override
    public Admin selectByPrimaryKey(Integer id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    public Admin selectByLoginName(String name) {
        return dao.selectByLoginName(name);
    }

    @Override
    public int insert(Admin record) {
        return dao.insert(record);
    }

    @Override
    public int insertSelective(Admin record) {
        return dao.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return dao.deleteByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(Admin record) {
        return dao.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Admin record) {
        return updateByPrimaryKey(record);
    }
}
