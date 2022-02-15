package com.tyq.gulimall.order.dao;

import com.tyq.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author tyq
 * @email ${email}
 * @date 2022-02-09 18:50:11
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
