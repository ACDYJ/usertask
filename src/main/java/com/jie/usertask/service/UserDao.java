package com.jie.usertask.service;
import com.jie.usertask.entities.User;
import com.jie.usertask.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDao {

    @Autowired(required = false)
    UserMapper userMapper;
    public User findByStudentId(String studentid){return userMapper.findUserByStudentId(studentid);}
    public User insertUser(User user)
    {
        userMapper.insertUser(user);
        return user;
    }
    public List<User> ListUser(){return userMapper.ListUser();}
    public User findById (int id){return userMapper.findUserById(id);}

    public int Update(User user){return userMapper.Update(user);}
    public int delete (int id) {return userMapper.delete(id);}

    public User doLogin(String StudentId,String password)
    {
       User user= userMapper.login(StudentId,password);
        return user;
    }



}
