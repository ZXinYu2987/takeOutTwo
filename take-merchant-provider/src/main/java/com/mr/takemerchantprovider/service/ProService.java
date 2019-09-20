package com.mr.takemerchantprovider.service;

import com.mr.take.common.DataGridVO;
import com.mr.take.domain.Merchant;
import com.mr.take.domain.Store;

import java.util.List;

public interface ProService {


    //入驻商家
    int  saveMerchant(Merchant mer);

    //查询商家
    List<Merchant> queryMerList();

    //根据id查询店铺表
    Store queryStortById(Integer mid);
}
