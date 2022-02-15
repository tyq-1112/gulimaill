package com.tyq.gulimall.member.feign;

import com.tyq.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author tangyuqun
 * @Date 2022/2/10
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/test/feign")
    public R testFeign();

}
