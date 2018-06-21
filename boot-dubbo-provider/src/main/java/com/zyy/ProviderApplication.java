package com.zyy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @Description:
 * @Author: 郑玥延
 * @Date: 11:04 2018/6/21
 */
@SpringBootApplication
@ImportResource({"classpath:config/spring-dubbo.xml"})
public class ProviderApplication {

    public static void main(String[] args){
        SpringApplication.run(ProviderApplication.class, args);
    }

}
