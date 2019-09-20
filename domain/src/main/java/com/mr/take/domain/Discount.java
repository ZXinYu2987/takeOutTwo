package com.mr.take.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mr.take.common.Page;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Discount extends Page {

    private Integer discountId;//优惠券ID

    private Integer sid; //商家ID  外键

    private Integer userId; //用户ID  外键

    private String discountName; //优惠券名称

    private Integer discountType; //优惠券类型

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT + 8")
    private Date discountBegin;  //有限期之开始时间

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT + 8")
    private Date discountEnd; //有效期之结束时间

    private String discountCondition; //使用条件

    private Integer discountMoney;  //面值

    private Integer discountNumber; //数量

    private Integer discountStatus; //状态
}
