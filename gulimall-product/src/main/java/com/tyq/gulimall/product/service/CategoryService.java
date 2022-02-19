package com.tyq.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tyq.common.utils.PageUtils;
import com.tyq.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author tyq
 * @email ${email}
 * @date 2022-02-13 19:54:42
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> asList);
}

