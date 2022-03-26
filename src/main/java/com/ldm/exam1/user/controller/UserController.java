package com.ldm.exam1.user.controller;

import com.ldm.exam1.user.dao.UserRepository;
import com.ldm.exam1.user.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/users")
    @ResponseBody
    public List<User> users(){
        return userRepository.findAll();
    }

    @RequestMapping("/user")
    @ResponseBody
    public User user(){
        User user = new User();
        return user;
    }
}
