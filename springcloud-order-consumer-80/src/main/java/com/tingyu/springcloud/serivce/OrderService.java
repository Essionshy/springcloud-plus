package com.tingyu.springcloud.serivce;

import com.tingyu.springcloud.entities.Order;

/**
 * @Author essionshy
 * @Create 2020/3/28 1:13
 * @Version springcloud-plus
 */
public interface OrderService {
    Order getById(Integer id);

    int create(Order order);
}
