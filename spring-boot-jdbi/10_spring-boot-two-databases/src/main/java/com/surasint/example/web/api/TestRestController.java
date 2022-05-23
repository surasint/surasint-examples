package com.surasint.example.web.api;

import com.surasint.example.db.UserBean;
import com.surasint.example.service.UserService1;
import com.surasint.example.service.UserService2;
import com.surasint.example.service.UserServiceAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestRestController {

    private static int i;

    @Autowired
    UserService1 userService1;

    @Autowired
    UserService2 userService2;

    @Autowired
    UserServiceAll userServiceAll;

    @GetMapping("/api/user1/list")
    public List<UserBean> list() {
        return userService1.list();
    }

    @GetMapping("/api/user1/insertOK")
    public Integer insertOK() {
        return userService1.insertOK();
    }


    @GetMapping("/api/user2/list")
    public List<UserBean> list2() {
        return userService2.list();
    }

    @GetMapping("/api/user2/insertOK")
    public Integer insertOK2() {
        return userService2.insertOK();
    }

    @GetMapping("/api/user/insertBothOK")
    public String insertBothOK() {
        return userService1.insertBothOK();
    }

    @GetMapping("/api/user/insertBothNotOK")
    public String insertBothNotOK() {
        userService1.insertBothNotOK();
        return "never happen";
    }

    @GetMapping("/api/userAll/insertOK")
    public String insertAllOK() {
        userServiceAll.insertAll();
        return "OK";
    }
    @GetMapping("/api/userAll/insertNotOK")
    public String insertAllNotOK() {
        userServiceAll.insertAllNotOK();
        return "OK";
    }


}
