package com.surasint.example.service;

import com.surasint.example.db.UserBean;
import com.surasint.example.db.UserDao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Component
public class UserService1 {

    @Autowired
    private UserDao1 userDao;

    @Autowired
    private UserService2 userService2;

    @Transactional
    public List<UserBean> list(){
        return userDao.list();
    }

    @Transactional
    public Integer insertOK(){
        UserBean test = new UserBean();
        test.setUsername("username"+new Date().getTime());
        return userDao.insert(test);
    }

    @Transactional
    public String insertBothOK(){
        UserBean test = new UserBean();
        test.setUsername("username"+new Date().getTime());
        String result ="";
        result = "" + userDao.insert(test);
        result = result + " and "+ userService2.insertOK();

        return result;
    }

    @Transactional()
    public void insertBothNotOK(){
        UserBean test = new UserBean();
        test.setUsername("username"+new Date().getTime());
        userDao.insert(test);
        userService2.insertNotOK();

        //this code will never be reached
        throw new RuntimeException("Test error while trying to insert both database");
    }
}
