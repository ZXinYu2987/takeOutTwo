package com.mr.takemerchantprovider.service.impl;

import com.mr.take.common.DataGridVO;
import com.mr.take.domain.Merchant;
import com.mr.take.domain.Store;
import com.mr.takemerchantprovider.mapper.ProviderMapper;
import com.mr.takemerchantprovider.service.ProService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("merSer")
public class ProserviceImpl implements ProService {


    @Autowired
    private ProviderMapper merchantMapper;

    @Override
    public int saveMerchant(Merchant mer) {
        mer.setMdate(new Date());
       return merchantMapper.saveMerchant(mer);
    }

    @Override
    public List<Merchant>  queryMerList() {
        List<Merchant> merchantList=merchantMapper.queryMerList();
        return merchantList;
    }

    @Override
    public Store queryStortById(Integer mid) {
        return merchantMapper.queryStortById(mid);
    }
}
