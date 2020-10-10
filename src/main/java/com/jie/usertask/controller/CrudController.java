package com.jie.usertask.controller;

import com.jie.usertask.service.TaskDao;
import com.jie.usertask.service.UserDao;
import com.jie.usertask.entities.Task;
import com.jie.usertask.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(value = "/CRUD", method = {RequestMethod.GET, RequestMethod.POST})
public class CrudController {

    @Autowired
    private TaskDao taskDao;
    @RequestMapping("/ListUser")
    @ResponseBody
    public List<User> ListUser() {
        return userDao.ListUser();
    }

    @RequestMapping("/ListTask")
    @ResponseBody
    public Collection <Task> ListTask() {
        return taskDao.getAll();
    }

    @RequestMapping("/Listbyid")
    @ResponseBody
    public Collection <Task> ListById(int id) {
        return taskDao.getById(id);
    }




    @RequestMapping("/ListUserByStudentId")
    @ResponseBody
    public User ListUserByStudentId(String StudentId) {
        return userDao.findByStudentId(StudentId);
    }

    @RequestMapping("/findUserById")
    @ResponseBody
    public User FindUserById(int id) {
        return userDao.findById(id);
    }

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(int id) {
        int result = userDao.delete(id);
        if (result >= 1) {
            return "删除成功" + result;
        } else {
            return "删除失败";
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(User user) {
        int result = userDao.Update(user);
        if (result >= 1) {
            return "修改成功" + result;
        } else {
            return "修改失败";
        }

    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public User insert(User user) {
        return userDao.insertUser(user);
    }




}
