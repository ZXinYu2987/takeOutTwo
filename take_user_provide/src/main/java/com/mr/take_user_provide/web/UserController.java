package com.mr.take_user_provide.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Value("${server.port}")
    String port;

    @ResponseBody
    @RequestMapping("test")
    public String test(String name){
        return "提供者 " + name + port;
    }
}
