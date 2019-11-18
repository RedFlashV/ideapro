package com.atguigu.springboot.springbootapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {
    @Autowired
    DataSource dataSource;
    @RequestMapping("/hello")
    public String hello(String username){
        System.out.println("username = [" + username + "]");
        System.out.println("HelloController.hello");
        System.out.println("dataSource = " + dataSource);
        return "haha";
    }

}
