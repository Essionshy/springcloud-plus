package com.tingyu.springcloud.service;

import com.tingyu.springcloud.commons.CommonResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author essionshy
 * @Create 2020/3/31 12:25
 * @Version springcloud-plus
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {

    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@Param("productId") Long productId,@Param("count") Integer count);
}
