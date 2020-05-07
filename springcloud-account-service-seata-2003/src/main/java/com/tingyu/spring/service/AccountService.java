package com.tingyu.spring.service;

import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @Author essionshy
 * @Create 2020/3/31 13:15
 * @Version springcloud-plus
 */
public interface AccountService {
    /**
     * 扣减账户
     * @param userId
     * @param money
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
