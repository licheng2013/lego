package com.example.springBootDemo.configuration;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                // 以下不用登录就能访问
                .antMatchers("/","errorPage").permitAll()
                // 其他请求必须登录才能访问
                .anyRequest().authenticated();
        http.formLogin()
                .successForwardUrl("/index");
        // 登录页面
        //.loginPage("/loginPage")
        // 表单提交位置
        //.loginProcessingUrl("/fromLogin");

        // 开启注销功能
        http.logout();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService()).passwordEncoder(new BCryptPasswordEncoder());
    }
}
