package com.example.springBootDemo.model;

import lombok.Data;

/**
 * 角色权限对应关系实体类
 */
@Data
public class RolePermission {
    // 角色编号
    private String roleId;

    // 权限编号
    private String PermissionId;
}
