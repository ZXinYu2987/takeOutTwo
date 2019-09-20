package com.mr.couponfeign.controller;

import com.mr.couponfeign.service.IFeiService;
import com.mr.take.common.DataGridVO;
import com.mr.take.domain.Discount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FeiController {

    @Autowired
    private IFeiService service;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("queryCoupon")
    public DataGridVO queryCoupon(Discount discount){

        return service.queryCoupon(discount);
    }
}
