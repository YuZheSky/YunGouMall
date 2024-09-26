package com.yuzhe.yungoumall.product.dao;

import com.yuzhe.yungoumall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author yuzhe
 * @email 3454579743@qq.com
 * @date 2024-09-24 21:16:51
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
