package com.example.springBootDemo.configuration;

import com.example.springBootDemo.model.Role;
import com.example.springBootDemo.model.User;
import com.example.springBootDemo.model.UserRole;
import com.example.springBootDemo.service.RoleService;
import com.example.springBootDemo.service.UserRoleService;
import com.example.springBootDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private UserRoleService userRoleService;

    @Override
    public UserDetails loadUserByUsername(String loginName) throws UsernameNotFoundException {
        User user = userService.selectByName(loginName);

        if (user == null){
            throw new UsernameNotFoundException("用户不存在");
        }
        // 添加权限
        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
        List<UserRole> roleList = userRoleService.selectByUserId(user.getId());
        for (UserRole userRole : roleList){
            Role role = roleService.selectById(userRole.getRoleId());
            authorities.add(new SimpleGrantedAuthority(role.getDesc()));
        }

        return new org.springframework.security.core.userdetails.User(user.getLoginName(), user.getPassword(), authorities);
    }
}
