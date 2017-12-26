package com.surasint.example.web.api;

import com.surasint.example.db.UserBean;
import com.surasint.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestRestController {

    private static int i;

    @GetMapping("/api/count")
    public Integer count() {
        return i++;
    }

    @GetMapping("/api/count2")
    public Integer count2() {
        return i++;
    }

    @Autowired
    UserService userService;
    @GetMapping("/api/user/list")
    public List<UserBean> list() {
        return userService.list();
    }

    @GetMapping("/api/user/insertOK")
    public Integer insertOK() {
        return userService.insertOK();
    }

    @GetMapping("/api/user/insertNotOK")
    public String insertNotOK() {
        userService.insertAndFail();
        return "ok";
    }

}
