package com.mr.takedsicountcoupons.controller;

import com.mr.take.domain.Discount;
import com.mr.takedsicountcoupons.service.DisService;
import com.mr.take.common.DataGridVO;
import com.mr.take.domain.Store;
import com.mr.take.domain.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisController {
    @Autowired
    private DisService disService;


    @RequestMapping("queryCoupon")
    public DataGridVO queryCoupon(Discount discount){
        DataGridVO dg=disService.queryCoupon(discount);
        return dg;
    }
}
