package com.zyy.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zyy.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: 郑玥延
 * @Date: 11:08 2018/6/21
 */
@RestController
@RequestMapping("/")
public class TestController {

    @Reference(version = "1.0.0")
    UserService userService;

    @GetMapping("hello")
    public String hello() {
        return userService.sayHello("Hello springboot and dubbo!");
    }

}
