package com.tingyu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author essionshy
 * @Create 2020/3/28 10:15
 * @Version springcloud-plus
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String server;

    @GetMapping("/payment/consul")
    public String get(){
        String result="成功注册进Consul服务注册中心："+server+"\t"+System.currentTimeMillis();
        return  result;
    }

}
