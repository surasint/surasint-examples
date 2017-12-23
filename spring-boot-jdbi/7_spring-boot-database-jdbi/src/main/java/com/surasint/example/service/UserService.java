package com.surasint.example.service;

import com.surasint.example.db.UserBean;
import com.surasint.example.db.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Component
public class UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public List<UserBean> list(){
        System.out.println(userDao.list());
        return userDao.list();
    }

    @Transactional
    public Integer insertOK(){
        UserBean test = new UserBean();
        test.setUsername("username"+new Date().getTime());
        return userDao.insert(test);
    }

    @Transactional
    public void insertAndFail(){
        UserBean test = new UserBean();
        test.setUsername("username"+new Date().getTime());
        userDao.insert(test);

        throw new RuntimeException("Hello this is an error message");
    }

}
