package com.zyy.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description:
 * @Author: 郑玥延
 * @Date: 10:59 2018/6/21
 */
@Data
public class User implements Serializable{

    private String userName;

    private String password;

    private Integer age;

}
