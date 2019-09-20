package com.mr.takemerchantprovider.mapper;

import com.mr.take.domain.Merchant;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProviderMapper {

    //商家入驻
    int  saveMerchant(Merchant mer);

    //查询条数
    int queryCount();

    //查询表信息
    List<Merchant> queryMerList();
}
