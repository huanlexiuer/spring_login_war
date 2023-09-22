package com.example.war;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.example.war.mapper")
@SpringBootApplication
public class WarApplication {

    public static void main(String[] args) {
        SpringApplication.run(WarApplication.class, args);
    }

}
