package com.ldm.exam1.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class UserController {
    @RequestMapping("/users")
    @ResponseBody
    public String users(){
        return "유저 여러명";
    }

    @RequestMapping("/user")
    @ResponseBody
    public String user(){
        return "유저 한명";
    }
}
