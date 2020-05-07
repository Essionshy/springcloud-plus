package com.tingyu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author essionshy
 * @Create 2020/3/28 10:29
 * @Version springcloud-plus
 */
@RestController
@Slf4j
public class OrderController {
    private static final String SERVER_ADDRESS="http://springcloud-payment-service";

    @Resource
    private RestTemplate restTemplate;

    @Value("${server.port}")
    private String server;
    @GetMapping("/consumer/consul")
    public String get(){
        String result = restTemplate.getForObject(SERVER_ADDRESS+"/payment/consul", String.class);
        return  result;
    }
}
