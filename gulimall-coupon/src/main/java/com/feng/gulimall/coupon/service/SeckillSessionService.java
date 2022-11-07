package com.feng.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.feng.common.utils.PageUtils;
import com.feng.gulimall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author wang
 * @email wang_zhidian@gmail.com
 * @date 2022-11-05 16:22:05
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

