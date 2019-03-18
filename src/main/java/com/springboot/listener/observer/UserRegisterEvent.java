package com.springboot.listener.observer;

import com.springboot.listener.bean.UserBean;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;
@Getter//动态的为类下的属性增加get和set方法，如果属性改动了，也可以动态的变化
public class UserRegisterEvent extends ApplicationEvent {
    private UserBean user;

    //user参数是我们自定义的注册用户对象，该对象可以在监听内被获取
    public UserRegisterEvent(Object source, UserBean user) {
        super(source);
        this.user=user;

    }
}
