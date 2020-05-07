package com.tingyu.springcloud.controller;

import com.tingyu.springcloud.commons.CommonResult;
import com.tingyu.springcloud.domain.Order;
import com.tingyu.springcloud.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author essionshy
 * @Create 2020/3/31 12:37
 * @Version springcloud-plus
 */
@RestController
@Slf4j
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping(value = "/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200,"创建订单成功");
    }
}
