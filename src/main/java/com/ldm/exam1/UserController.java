package com.ldm.exam1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/users")
public class UserController {
    @RequestMapping("/users")
    @ResponseBody
    public String users(){
        return "Hi";
    }
}