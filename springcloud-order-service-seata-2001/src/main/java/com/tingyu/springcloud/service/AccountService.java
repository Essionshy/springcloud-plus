package com.tingyu.springcloud.service;

import com.tingyu.springcloud.commons.CommonResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.math.BigDecimal;

/**
 * @Author essionshy
 * @Create 2020/3/31 12:24
 * @Version springcloud-plus
 */
@FeignClient(value = "seata-account-service")
public interface AccountService {
    @PostMapping(value = "/account/decrease")
    CommonResult decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
