package com.xu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xu.model.ResultMsg;
import com.xu.model.User;

@Controller
@RequestMapping(value="user")
public class UserController {
    public ResultMsg login(User user){
        
        return null;
    }
 
}
