package com.mr.takemerchantconsummer.controller;

import com.mr.takemerchantconsummer.service.ConsummerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConsummerController {

    @Autowired
    private ConsummerService merService;

    //跳转到商家入驻页面
    @RequestMapping("merchantFun")
    public String merchantFun(){
        return "merchant/saveMerchant";
    }

    //新增成功后返回到新增页面
    @RequestMapping("toIndex")
    public String toIndex(){
        return "index";
    }
}
