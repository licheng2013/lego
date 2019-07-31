package com.example.springBootDemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springBootDemo.dao")
public class SprinBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SprinBootDemoApplication.class, args);
    }

}
