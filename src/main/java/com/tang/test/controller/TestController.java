package com.tang.test.controller;

import com.tang.test.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/findUserById")
    public User findUserById(@RequestParam("id") Long id){
        User user = new User();
        user.setId(id);
        user.setName("张三");

        return user;
    }
}
