package com.feng.gulimall.order.dao;

import com.feng.gulimall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author wang
 * @email wang_zhidian@gmail.com
 * @date 2022-11-05 16:56:19
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
