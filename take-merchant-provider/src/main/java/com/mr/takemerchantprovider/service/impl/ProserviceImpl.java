package com.mr.takemerchantprovider.service.impl;

import com.mr.take.common.DataGridVO;
import com.mr.take.domain.Merchant;
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
    public DataGridVO queryMerList() {
        int total=merchantMapper.queryCount();
        List<Merchant> merchantList=merchantMapper.queryMerList();
        DataGridVO dgv=new DataGridVO();
        dgv.setRows(merchantList);
        dgv.setTotal(total);
        return dgv;
    }
}
