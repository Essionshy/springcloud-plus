package com.tingyu.springcloud.serivce.impl;

import com.tingyu.springcloud.dao.OrderDao;
import com.tingyu.springcloud.entities.Order;
import com.tingyu.springcloud.serivce.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author essionshy
 * @Create 2020/3/28 1:14
 * @Version springcloud-plus
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;
    @Override
    public Order getById(Integer id) {
        return orderDao.getById(id);
    }

    @Override
    public int create(Order order) {
        return orderDao.create(order);
    }
}
