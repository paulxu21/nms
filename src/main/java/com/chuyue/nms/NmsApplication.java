package com.chuyue.nms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.chuyue.nms.mapper")
@SpringBootApplication
public class NmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(NmsApplication.class, args);
    }

}
