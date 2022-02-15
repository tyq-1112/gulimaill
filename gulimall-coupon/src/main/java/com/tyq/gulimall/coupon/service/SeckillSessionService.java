package com.tyq.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tyq.common.utils.PageUtils;
import com.tyq.gulimall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author tyq
 * @email ${email}
 * @date 2022-02-09 18:14:56
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

