package com.cyh.hibernate.service.impl;

import com.cyh.hibernate.Utils.Result;
import com.cyh.hibernate.dao.UserRepository;
import com.cyh.hibernate.entity.User;
import com.cyh.hibernate.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 程亚辉的代码
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserRepository userRepository;

    @Override
    public Result saveUser(User user) {
        User save = userRepository.save(user);
        return new Result(save);
    }

    @Override
    public Result queryAll() {
        List<User> users = userRepository.findAll();
        return new Result(users);
    }

    @Override
    public Result getByNameAndAge(String name, int age) {
        List<User> byNameAndAge = userRepository.getByNameAndAge(name, age);
        return new Result(byNameAndAge);
    }
}
