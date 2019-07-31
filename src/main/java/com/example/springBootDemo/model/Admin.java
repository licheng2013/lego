package com.example.springBootDemo.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Data
public class Admin {
    private Integer id;
    private String loginName;
    private String password;
}
