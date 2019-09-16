package com.example.springBootDemo.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

/**
 * 角色实体类
 */
@Data
public class Role {
    // 角色编号
    private Integer id;

    // 角色描述
    private String desc;
}
