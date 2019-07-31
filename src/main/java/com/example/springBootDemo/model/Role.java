package com.example.springBootDemo.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

@Data
public class Role {
    private Integer id;
    private String desc;
    private String code;
}
