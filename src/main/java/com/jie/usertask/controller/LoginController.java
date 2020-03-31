package com.jie.usertask.controller;

import com.jie.usertask.dao.UserDao;
import com.jie.usertask.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    UserDao userDao;
    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session, HttpServletRequest request){

        User user=userDao.doLogin(username,password);
        if(user!=null){
            //登陆成功，防止表单重复提交，可以重定向到主页
            int id=user.getId();
            session.setAttribute("loginUser",username);
            session.setAttribute("loginId",id);

            return "redirect:/main.html";
        }else{
            //登陆失败

            map.put("msg","用户名密码错误");
            return  "login";
        }

    }

}
