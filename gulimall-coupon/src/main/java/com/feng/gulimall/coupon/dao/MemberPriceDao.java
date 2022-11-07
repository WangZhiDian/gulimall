package com.feng.gulimall.coupon.dao;

import com.feng.gulimall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author wang
 * @email wang_zhidian@gmail.com
 * @date 2022-11-05 16:22:04
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
