package com.jie.usertask;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan
@SpringBootApplication
public class UsertaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsertaskApplication.class, args);
    }

}
