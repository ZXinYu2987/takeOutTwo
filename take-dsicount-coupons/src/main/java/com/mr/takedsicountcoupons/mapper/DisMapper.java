package com.mr.takedsicountcoupons.mapper;

import com.mr.take.domain.Discount;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DisMapper {
    List<Discount> queryCoupon(Discount discount);

    int queryTotal(Discount discount);
}
