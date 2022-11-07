package com.feng.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.feng.common.utils.PageUtils;
import com.feng.gulimall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author wang
 * @email wang_zhidian@gmail.com
 * @date 2022-11-05 16:22:05
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

