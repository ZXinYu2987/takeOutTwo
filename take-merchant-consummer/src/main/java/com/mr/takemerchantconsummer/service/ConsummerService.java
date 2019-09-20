package com.mr.takemerchantconsummer.service;

import com.mr.take.domain.Merchant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("PROVIDER-HELLO")
public interface ConsummerService {

    //新增
    @RequestMapping("/saveMerchant")
    int saveMerchant(@RequestBody Merchant mer);

    //查询
    @RequestMapping("/queryMerList")
    List<Merchant> queryMerchant();
}
