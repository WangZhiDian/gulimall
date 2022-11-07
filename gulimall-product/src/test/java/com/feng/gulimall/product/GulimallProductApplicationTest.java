package com.feng.gulimall.product;

import com.feng.gulimall.product.entity.BrandEntity;
import com.feng.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class GulimallProductApplicationTest {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("华为荣耀系列");
        brandEntity.setDescript("华为");
        brandService.save(brandEntity);
    }

    @Test
    void updateTest() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("华为荣耀系列");
        brandEntity.setDescript("ttttt");
        brandEntity.setBrandId(13L);
        brandService.updateById(brandEntity);
    }
}