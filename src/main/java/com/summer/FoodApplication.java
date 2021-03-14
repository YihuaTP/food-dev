package com.summer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@MapperScan(basePackages = "com.summer.mapper")                   // 扫描mybatis通用mapper所在的包
@ComponentScan(basePackages = {"com.summer","org.n3r.idworker"})  // 扫描所有包及其相关组件包
public class FoodApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoodApplication.class, args);
    }


    /**
     * @MapperScan：https://blog.csdn.net/manchengpiaoxue/article/details/84937257
     */
}
