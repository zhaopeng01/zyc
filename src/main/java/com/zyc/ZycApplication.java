package com.zyc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ZycApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZycApplication.class, args);
    }
}
