package com.example.springBootDemo.service;

import com.example.springBootDemo.model.Role;

public interface RoleService {
    int insert(Role record);

    int insertSelective(Role record);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKey(Role record);

    int updateByPrimaryKeySelective(Role record);

    Role selectByPrimaryKey(Integer id);
}
