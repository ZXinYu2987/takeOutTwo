package com.mr.takedsicountcoupons.service;

import com.mr.take.common.DataGridVO;
import com.mr.take.domain.Discount;

public interface DisService {
    DataGridVO queryCoupon(Discount discount);
}
