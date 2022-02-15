package com.tyq.gulimall.product;

import com.tyq.gulimall.product.entity.BrandEntity;
import com.tyq.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = BrandEntity.builder()
                .name("苹果").build();
        brandService.save(brandEntity);
    }

}
