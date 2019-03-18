package com.springboot.listener.controller;

import com.springboot.listener.bean.UserBean;
import com.springboot.listener.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/register")
    public String register(UserBean user){
        userService.regiter(user);
        return "注册成功";

    }
}
