package com.example.springBootDemo.service;

import com.example.springBootDemo.model.Admin;

public interface AdminService{

    Admin selectByPrimaryKey(Integer id);

    Admin selectByLoginName(String name);

    int insert(Admin record);

    int insertSelective(Admin record);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKey(Admin record);

    int updateByPrimaryKeySelective(Admin record);
}
