package com.tingyu.springcloud.service.impl;

import com.tingyu.springcloud.dao.PaymentDao;
import com.tingyu.springcloud.entities.Payment;
import com.tingyu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author essionshy
 * @Create 2020/3/27 23:14
 * @Version springcloud-plus
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public Payment findById(Integer id) {
        return paymentDao.findById(id);
    }

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }
}
