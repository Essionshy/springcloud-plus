package com.tingyu.springcloud.service;

import com.tingyu.springcloud.entities.Payment;

/**
 * @Author essionshy
 * @Create 2020/3/27 23:13
 * @Version springcloud-plus
 */
public interface PaymentService
{
    Payment findById(Integer id);

    int create(Payment payment);
}
