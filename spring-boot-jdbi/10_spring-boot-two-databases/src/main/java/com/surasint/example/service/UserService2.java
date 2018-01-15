package com.surasint.example.service;

import com.surasint.example.db.UserBean;
import com.surasint.example.db.UserDao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Component
public class UserService2 {

    @Autowired
    private UserDao2 userDao2;

    @Transactional("tm2")
    public List<UserBean> list(){
        return userDao2.list();
    }

    @Transactional("tm2")
    public Integer insertOK(){
        UserBean test = new UserBean();
        test.setUsername("username"+new Date().getTime());
        return userDao2.insert(test);
    }

    @Transactional("tm2")
    public void insertNotOK(){
        UserBean test = new UserBean();
        test.setUsername("username"+new Date().getTime());
        userDao2.insert(test);
        throw new RuntimeException("Test error while trying to insert both database");
    }
}
