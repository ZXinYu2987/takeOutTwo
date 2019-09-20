package com.mr.takemerchantprovider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("merchantUrl")
public class ProviderController {

    //去往menu页面
    @RequestMapping("toMenu")
    public String toIndex(){

        return "/menu";
    }

    //去往list页面
    @RequestMapping("toList")
    public String toList(){

        return "/list";
    }

}
