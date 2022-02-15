package com.tyq.gulimall.product.dao;

import com.tyq.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author tyq
 * @email ${email}
 * @date 2022-02-13 19:54:42
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
