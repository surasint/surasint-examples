package com.surasint.example.service;

import com.surasint.example.db.UserBean;
import com.surasint.example.db.UserDao1;
import com.surasint.example.db.UserDao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Component
public class UserServiceAll {

    @Autowired
    private UserDao1 userDao;

    @Autowired
    private UserDao2 userDao2;

    @Transactional(value="chainedTransactionManager")
    public void insertAll() {
        UserBean test = new UserBean();
        test.setUsername("username" + new Date().getTime());
        userDao.insert(test);

        userDao2.insert(test);
    }

    @Transactional(value="chainedTransactionManager")
    public void insertAllNotOK() {
        UserBean test = new UserBean();
        test.setUsername("username" + new Date().getTime());
        userDao.insert(test);

        userDao2.insert(test);

        throw new RuntimeException("test");
    }
}
