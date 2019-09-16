package com.example.springBootDemo.model;

import lombok.Data;

/**
 * 权限实体类
 */
@Data
public class Permission {
    // 权限编号
    private Integer id;

    // 权限描述
    private String desc;
}
