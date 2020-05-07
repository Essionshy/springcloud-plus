package com.tingyu.springcloud.service.impl;

import com.tingyu.springcloud.dao.OrderDao;
import com.tingyu.springcloud.domain.Order;
import com.tingyu.springcloud.service.AccountService;
import com.tingyu.springcloud.service.OrderService;
import com.tingyu.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author essionshy
 * @Create 2020/3/31 12:16
 * @Version springcloud-plus
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Resource
    private StorageService storageService;

    @Resource
    private AccountService accountService;
    /**
     * 下订单业务
     * @param order
     */
    @Override
    public void create(Order order) {
        log.info("****************创建订单开始*******************");

        orderDao.create(order);
        //减库存
        log.info("****************扣减库存开始*******************");
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("****************扣减库存结束*******************");
        //扣账户
        log.info("****************扣减账户开始*******************");
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("****************扣减账户结束*******************");
        //修改订单状态
        orderDao.updateStatus(order.getUserId(),0);

        log.info("****************创建订单结束*******************");
    }
}
