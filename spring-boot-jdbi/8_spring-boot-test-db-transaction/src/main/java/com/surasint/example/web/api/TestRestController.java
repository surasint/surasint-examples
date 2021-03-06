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

    @Autowired
    UserService userService;

    @GetMapping("/api/user/list")
    public List<UserBean> list() {
        return userService.list();
    }

    @GetMapping("/api/user/listTwoTimes")
    public List<UserBean> listTwoTimes() {
        return userService.listTwoTimes();
    }

    @GetMapping("/api/user/listTwoDaos")
    public List<UserBean> listTwoDao() {
        return userService.listTwoDaos();
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

    @GetMapping("/api/user/insertNotOKNotRollback")
    public String insertNotOKNotRollback() throws Exception {
        userService.insertAndFailButNotRollback();
        return "ok";
    }

    @GetMapping("/api/user/insertNotOKAndRollback")
    public String insertNotOKAndRollback() throws Exception {
        userService.insertAndFailAndRollback();
        return "ok";
    }

    @GetMapping("/api/user/deleteAll")
    public Integer deleteAll() {
        return userService.deleteAll();
    }
}
