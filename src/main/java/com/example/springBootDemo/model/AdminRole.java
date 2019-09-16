package com.example.springBootDemo.model;

import lombok.Data;

/**
 * 用户角色实体类
 */
@Data
public class AdminRole {
    // 用户编号
    private String userId;

    // 角色编号
    private String roleId;
}
