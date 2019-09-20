package com.mr.takemerchantprovider.controller;

import com.mr.take.common.CommonIOUtil;
import com.mr.take.common.DataGridVO;
import com.mr.take.domain.Merchant;
import com.mr.take.domain.Store;
import com.mr.takemerchantprovider.service.ProService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private ProService merSer;

    //上传图片
    @RequestMapping("upload")
    public String upload(@PathVariable("img") MultipartFile img, HttpServletRequest req){

        String s = CommonIOUtil.uploadFile(img, req, "D://img");
        return  s;
    }

    //商家入驻
    @RequestMapping("saveMerchant")
    public int saveMerchant(@RequestBody Merchant mer){
       return merSer.saveMerchant(mer);
    }

    //商家入驻查询
    @RequestMapping("queryMerList")
    public List<Merchant> queryMerList(){

        List<Merchant> list=merSer.queryMerList();
        return list;
    }

    //店铺查询
    public Store queryStortById(Integer mid){
        Store store=merSer.queryStortById(mid);
        return store;
    }
}
