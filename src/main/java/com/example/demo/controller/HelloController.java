package com.example.demo.controller;

import com.example.demo.service.HelloSerivce;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: movie
 * @Date: 2019/1/15 15:35
 */
@RestController
public class HelloController {
    @Resource
    private HelloSerivce helloSerivce;

    @RequestMapping("hi")
    public String hi() {
        return helloSerivce.hello();
    }
}
