package com.zyy.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zyy.service.TestService;

/**
 * @Description:
 * @Author: 郑玥延
 * @Date: 16:45 2018/7/4
 */
@Service(version="1.0.0")
public class TestServiceImpl implements TestService {

    @Override
    public String sayHello(String str) {
        return "hello !";
    }
}
