package com.example.springBootDemo.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

@Data
public class Role implements GrantedAuthority {
    private String id;
    private String desc;

    @Override
    public String getAuthority() {
        return this.desc;
    }
}
