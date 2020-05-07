package com.tingyu.spring.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @Author essionshy
 * @Create 2020/3/31 13:13
 * @Version springcloud-plus
 */
@Mapper
public interface AccountDao {
    /**
     * 扣减账户
     * @param userId
     * @param money
     */
    void decrease(@Param("userId") Long userId, @Param("money")BigDecimal money);
}
