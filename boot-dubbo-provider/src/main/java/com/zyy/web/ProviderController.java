package com.zyy.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zyy.service.Test2Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: 郑玥延
 * @Date: 17:58 2018/7/4
 */
@RestController
public class ProviderController {

    @Reference
    Test2Service test2Service;

    @RequestMapping("/hell")
    public String hell(){
        return test2Service.sayHello("hello");
    }

}
