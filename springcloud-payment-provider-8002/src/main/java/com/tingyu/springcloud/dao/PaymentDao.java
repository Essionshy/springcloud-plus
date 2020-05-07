package com.tingyu.springcloud.dao;

import com.tingyu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author essionshy
 * @Create 2020/3/27 22:54
 * @Version springcloud-plus
 */
@Mapper
public interface PaymentDao {
     Payment findById(Integer id);

     int create(Payment payment);
}
