package com.zyy.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zyy.service.UserService;

/**
 * @Description:
 * @Author: 郑玥延
 * @Date: 11:01 2018/6/21
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello(String str) {
        return "hello "+ str;
    }
}
