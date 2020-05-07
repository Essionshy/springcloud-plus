package com.tingyu.springcloud.dao;


import com.tingyu.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author essionshy
 * @Create 2020/3/31 10:15
 * @Version springcloud-plus
 */
@Mapper
public interface OrderDao {
    /**下订单*/
    void create(Order order);

    /**修改订单状态*/
    void updateStatus(@Param("userId") Long userId, @Param("status") Integer status);
}
