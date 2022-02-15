package com.tyq.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tyq.common.utils.PageUtils;
import com.tyq.gulimall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author tyq
 * @email ${email}
 * @date 2022-02-09 18:34:08
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

