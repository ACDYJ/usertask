package com.jie.usertask.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(HttpSession session)
    {
            return "hello jie";
    }
}
