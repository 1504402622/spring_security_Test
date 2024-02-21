package com.GLFS;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.GLFS.mapper")
public class TokenApplication {
    public static void main(String[] args) {
        //创建spring容器
        SpringApplication.run(TokenApplication.class,args);
    }
}
