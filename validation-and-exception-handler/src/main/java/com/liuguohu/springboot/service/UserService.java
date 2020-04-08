package com.liuguohu.springboot.service;

import com.liuguohu.springboot.domain.User;
import org.springframework.stereotype.Service;

/**
 * @program: springboot-exercise-parent
 * @description:
 * @author: liuguohu
 * @create: 2020-04-08 19:57
 **/

@Service
public class UserService {

    public String addUser(User user) {
        // 直接编写业务逻辑
        return "success";
    }
}
