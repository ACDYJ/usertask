package com.jie.usertask.controller;

import com.jie.usertask.dao.TaskDao;
import com.jie.usertask.entities.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.Collection;

@Controller
public class TaskController {
    @Autowired
    TaskDao taskDao;
    @GetMapping("/tasks")
    public String list(Model model, HttpSession session)
    {
        Collection<Task> tasks=taskDao.getAll();
        model.addAttribute("tasks",tasks);
        return "emp/list";
    }


    @GetMapping("/task")
    public String toAddPage(Model model){
        //来到添加页面,查出所有的部门，在页面显示
        return "emp/addgui";
    }
    @PostMapping("/task")
    public String addEmp(Task task){
        //来到员工列表页面

        System.out.println("保存的任务信息："+task);
        //保存员工
        taskDao.save(task);
        // redirect: 表示重定向到一个地址  /代表当前项目路径
        // forward: 表示转发到一个地址
        return "redirect:/tasks";
    }
}
