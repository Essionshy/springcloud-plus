package com.tingyu.springcloud.dao;

import com.tingyu.springcloud.entities.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author essionshy
 * @Create 2020/3/28 0:56
 * @Version springcloud-plus
 */
@Mapper
public interface OrderDao {
    Order getById(Integer id);

    int create(Order order);

}
