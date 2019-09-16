package com.example.springBootDemo.dao;

import com.example.springBootDemo.model.Role;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RoleMapper {
    int insert(Role record);

    int insertSelective(Role record);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKey(Role record);

    int updateByPrimaryKeySelective(Role record);

    Role selectByPrimaryKey(Integer id);
}
