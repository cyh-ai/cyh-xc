package com.cyh.hibernate.service;

import com.cyh.hibernate.Utils.Result;
import com.cyh.hibernate.entity.User;

public interface UserService {

    Result saveUser(User user);

    Result queryAll();

    Result getByNameAndAge(String name,int age);
}
