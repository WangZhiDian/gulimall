package com.feng.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.feng.common.utils.PageUtils;
import com.feng.gulimall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author wang
 * @email wang_zhidian@gmail.com
 * @date 2022-11-05 16:56:19
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

