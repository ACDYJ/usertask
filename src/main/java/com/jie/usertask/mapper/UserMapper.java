package com.jie.usertask.mapper;

import com.jie.usertask.entities.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public User  findUserByStudentId(String StudentId);
    public User  findUserById(Integer id);

    public List<User> ListUser();

    public int insertUser(User user);

    public User login(String StudentId,String password);

    public int delete(int id);

    public int Update(User user);
}
