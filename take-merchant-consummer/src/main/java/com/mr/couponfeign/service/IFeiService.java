package com.mr.couponfeign.service;

import com.mr.take.common.DataGridVO;
import com.mr.take.domain.Discount;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "PROVIDER-HELLO")
public interface IFeiService {

    @RequestMapping("queryCoupon")
    DataGridVO queryCoupon(@RequestBody Discount discount);
}
