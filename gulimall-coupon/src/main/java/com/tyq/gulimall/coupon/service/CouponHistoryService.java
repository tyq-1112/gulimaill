package com.tyq.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tyq.common.utils.PageUtils;
import com.tyq.gulimall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author tyq
 * @email ${email}
 * @date 2022-02-09 18:14:56
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

