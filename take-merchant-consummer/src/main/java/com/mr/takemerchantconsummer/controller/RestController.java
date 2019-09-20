package com.mr.takemerchantconsummer.controller;

import com.mr.take.common.CommonIOUtil;
import com.mr.take.domain.Merchant;
import com.mr.takemerchantconsummer.service.ConsummerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@org.springframework.web.bind.annotation.RestController
public class RestController {

   @Autowired
   private ConsummerService merService;

   @RequestMapping("upload")
   public String upload(@PathVariable("img") MultipartFile img,HttpServletRequest req){
       String path= CommonIOUtil.uploadFile(img,req,"D://img");
       return path;
   }

   //商家入驻
    @RequestMapping("saveMerchant")
    public Map<String,Integer> saveMerchant(Merchant mer){
        int code=merService.saveMerchant(mer);
        Map<String,Integer> map=new HashMap<>();
        if(code==1){
            map.put("errorCode",1);
        }else{
            map.put("errorCode",2);
        }
        return map;
    }

    //展示图片
    @RequestMapping("showPic")
    public void showPic(HttpServletResponse res,String path ){
       CommonIOUtil.readPic(path,res);
    }

    //查询商家入驻表
    //@RequestMapping("queryMerchant")
   /* public List<Merchant> queryMerchant(){

       return merchantList;
    }*/

}
