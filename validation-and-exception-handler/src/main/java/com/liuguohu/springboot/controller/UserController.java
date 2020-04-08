package com.liuguohu.springboot.controller;

import com.liuguohu.springboot.domain.User;
import com.liuguohu.springboot.result.ResultVO;
import com.liuguohu.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @program: springboot-exercise-parent
 * @description:
 * @author: liuguohu
 * @create: 2020-04-08 19:56
 **/

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public String addUser(@RequestBody @Valid User user) {
        return userService.addUser(user);
    }

    @GetMapping("/getUser")
    public User getUser() {
        User user = new User();
        user.setId(1L);
        user.setAccount("12345678");
        user.setPassword("12345678");
        user.setEmail("123@qq.com");

        return user;
    }
}
