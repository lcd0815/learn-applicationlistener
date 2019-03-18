package com.springboot.listener.bean;

import lombok.Data;

@Data//提供类所有属性的 getting 和 setting 方法，此外还提供了equals、canEqual、hashCode、toString 方法
public class UserBean {
    private String name;
    private String password;

}
