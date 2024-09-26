package com.yuzhe.yungoumall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuzhe.yungoumall.common.utils.PageUtils;
import com.yuzhe.yungoumall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author yuzhe
 * @email 3454579743@qq.com
 * @date 2024-09-24 21:16:51
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

