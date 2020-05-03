package com.springboot.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: exercise
 * @description:
 * @author: liuguohu
 * @create: 2020-05-03 21:05
 **/

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello springboot docker";
    }
}
