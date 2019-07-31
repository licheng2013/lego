package com.example.springBootDemo.dao;

import com.example.springBootDemo.model.Admin;

public interface AdminMapper {
    Admin selectById(Integer id);

    Admin selectByLoginName(String name);
}
