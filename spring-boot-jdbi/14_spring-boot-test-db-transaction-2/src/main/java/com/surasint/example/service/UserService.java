package com.surasint.example.service;

import com.surasint.example.db.UserBean;
import com.surasint.example.db.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public List<UserBean> list(){
        System.out.println(userDao.list());
        return userDao.list();
    }

    //notice that there is no @Transactional here
    public Integer insertConnectionLeak(){
        UserBean test = new UserBean();
        test.setUsername("username"+new Date().getTime());
        return userDao.insert(test);
    }

    @Transactional
    public Integer deleteAll(){
        return userDao.deleteAll();
    }
}
