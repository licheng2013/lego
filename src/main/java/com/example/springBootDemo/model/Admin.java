package com.example.springBootDemo.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * 管理用户实体类
 */
@Data
public class Admin {
    // 用户编号
    private Integer id;

    // 用户登录名
    private String loginName;

    // 用户密码
    private String password;

    // 用户创建时间
    private Date createTime;

    // 用户最后一次登录时间
    private Date lastLoginTime;
}
