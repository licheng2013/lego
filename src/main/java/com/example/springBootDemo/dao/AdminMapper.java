package com.example.springBootDemo.dao;

import com.example.springBootDemo.model.Admin;
import org.springframework.stereotype.Component;

@Component
public interface AdminMapper {
    Admin selectByPrimaryKey(Integer id);

    Admin selectByLoginName(String name);

    int insert(Admin record);

    int insertSelective(Admin record);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKey(Admin record);

    int updateByPrimaryKeySelective(Admin record);
}
