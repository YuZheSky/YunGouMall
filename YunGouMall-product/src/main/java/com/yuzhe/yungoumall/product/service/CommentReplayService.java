package com.yuzhe.yungoumall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuzhe.yungoumall.common.utils.PageUtils;
import com.yuzhe.yungoumall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author yuzhe
 * @email 3454579743@qq.com
 * @date 2024-09-24 21:16:51
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

