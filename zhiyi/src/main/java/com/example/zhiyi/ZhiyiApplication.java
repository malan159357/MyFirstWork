package com.example.zhiyi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.zhiyi.mapper")
public class ZhiyiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhiyiApplication.class, args);
    }

}
