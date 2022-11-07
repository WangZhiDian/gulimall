package com.feng.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.feng.common.utils.PageUtils;
import com.feng.gulimall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author wang
 * @email wang_zhidian@gmail.com
 * @date 2022-11-04 00:17:48
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

