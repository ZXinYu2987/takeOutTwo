package com.mr.takedsicountcoupons.service.impl;

import com.mr.takedsicountcoupons.mapper.DisMapper;
import com.mr.takedsicountcoupons.service.DisService;
import com.mr.take.common.DataGridVO;
import com.mr.take.domain.Discount;
import com.mr.take.domain.Store;
import com.mr.take.domain.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DisServiceImpl implements DisService {

    @Autowired
    private DisMapper disMapper;

    @Override
    public DataGridVO queryCoupon(Discount discount) {
        List<Discount> list=disMapper.queryCoupon(discount);
        int total=disMapper.queryTotal(discount);
        DataGridVO dg=new DataGridVO();
        dg.setRows(list);
        dg.setTotal(total);
        return dg;
    }
}
