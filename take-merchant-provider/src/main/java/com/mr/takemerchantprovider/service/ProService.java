package com.mr.takemerchantprovider.service;

import com.mr.take.common.DataGridVO;
import com.mr.take.domain.Merchant;

public interface ProService {


    //入驻商家
    int  saveMerchant(Merchant mer);

    //查询商家
    DataGridVO queryMerList();
}
