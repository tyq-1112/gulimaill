package com.tyq.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tyq.common.utils.PageUtils;
import com.tyq.gulimall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author tyq
 * @email ${email}
 * @date 2022-02-13 19:54:42
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

