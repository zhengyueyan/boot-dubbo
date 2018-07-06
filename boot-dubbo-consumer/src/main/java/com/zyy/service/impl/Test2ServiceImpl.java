package com.zyy.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zyy.service.Test2Service;

/**
 * @Description:
 * @Author: 郑玥延
 * @Date: 17:59 2018/7/4
 */
@Service
public class Test2ServiceImpl implements Test2Service{

    @Override
    public String sayHello(String str) {
        return "hello !";
    }

}
