package com.cyh.hibernate.dao;

import com.cyh.hibernate.Utils.Result;
import com.cyh.hibernate.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "userRepository")
public interface UserRepository extends JpaRepository<User,Integer> {

    List<User> getByNameAndAge(String name,int age);


}
