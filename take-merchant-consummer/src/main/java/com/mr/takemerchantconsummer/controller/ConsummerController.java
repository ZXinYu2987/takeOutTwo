package com.mr.takemerchantconsummer.controller;

import com.mr.take.domain.Merchant;
import com.mr.takemerchantconsummer.service.ConsummerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ConsummerController {

    @Autowired
    private ConsummerService merService;

    //跳转到商家入驻页面
    @RequestMapping("merchantFun")
    public String merchantFun(){
        return "merchant/saveMerchant";
    }

    //新增成功后返回到查询页面
    @RequestMapping("toIndex")
    public String toIndex(Model model){
        List<Merchant> merchantList=merService.queryMerchant();
        model.addAttribute("list",merchantList);
       // System.err.println(merchantList);
        return "index";
    }

    //跳转到详情店铺页面
    @RequestMapping("toShop")
    public String toShop(Integer mid,Model model){
       model.addAttribute("mid",mid);
        return "merchant/shop";
    }
}
