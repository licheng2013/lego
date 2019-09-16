package com.example.springBootDemo.service.impl;

import com.example.springBootDemo.dao.RoleMapper;
import com.example.springBootDemo.model.Role;
import com.example.springBootDemo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper dao;

    @Override
    public int insert(Role record) {
        return dao.insert(record);
    }

    @Override
    public int insertSelective(Role record) {
        return dao.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return dao.deleteByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(Role record) {
        return dao.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Role record) {
        return dao.updateByPrimaryKeySelective(record);
    }

    @Override
    public Role selectByPrimaryKey(Integer id) {
        return dao.selectByPrimaryKey(id);
    }
}
