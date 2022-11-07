package com.feng.gulimall.order.dao;

import com.feng.gulimall.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author wang
 * @email wang_zhidian@gmail.com
 * @date 2022-11-05 16:56:19
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}
