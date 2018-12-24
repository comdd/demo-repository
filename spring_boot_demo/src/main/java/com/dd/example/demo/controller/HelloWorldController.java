package com.dd.example.demo.controller;

import com.dd.example.demo.config.Myconfig;
import com.dd.example.demo.service.HelloWorldService;
import com.dd.example.demo.domain.entity.UserInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: dd Date: 2018/2/27 Time: 17:22
 * @version: 1.0.0
 */
@RestController
public class HelloWorldController {

    @Resource
    private HelloWorldService helloWorldService;
    @Resource
    private Myconfig myconfig;

    @RequestMapping("/hello")
    public String index() {
        return helloWorldService.getHello("lee");
    }

    @RequestMapping("/user")
    public UserInfo getUser(@RequestParam String userName) {
        return helloWorldService.getUser(userName);
    }
    @RequestMapping("/myconfig")
    public String getConfigInfo() {
        return myconfig.getName()+":"+myconfig.getAge();
    }
}
