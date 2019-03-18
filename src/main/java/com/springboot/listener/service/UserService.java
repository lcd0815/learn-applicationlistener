package com.springboot.listener.service;

import com.springboot.listener.UserRegisterEvent;
import com.springboot.listener.bean.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    ApplicationContext applicationContext;
    public void regiter(UserBean user){
        //业务逻辑等
        //发布事件
        applicationContext.publishEvent(new UserRegisterEvent(this,user));
    }
}
