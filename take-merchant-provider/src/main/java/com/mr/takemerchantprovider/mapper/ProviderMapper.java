package com.mr.takemerchantprovider.mapper;

import com.mr.take.domain.Merchant;
import com.mr.take.domain.Store;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProviderMapper {

    //商家入驻
    int  saveMerchant(Merchant mer);

    //查询表信息
    List<Merchant> queryMerList();

    //根据商家id查询店铺表
    Store queryStortById(Integer mid);
}
