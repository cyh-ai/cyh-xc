package com.cyh.hibernate.controller;

import com.cyh.hibernate.Utils.Result;
import com.cyh.hibernate.entity.User;
import com.cyh.hibernate.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("/save")
    public Result saveUser(User user){
        return userService.saveUser(user);
    }

    @RequestMapping("/queryAll")
    public Result queryAll(){
        return userService.queryAll();
    }

    @RequestMapping("/getByNameAndAge")
    public Result getByNameAndAge(String name, int age){
        Result byNameAndAge = userService.getByNameAndAge(name, age);
        System.out.println(byNameAndAge);
        return byNameAndAge;
    }
}
