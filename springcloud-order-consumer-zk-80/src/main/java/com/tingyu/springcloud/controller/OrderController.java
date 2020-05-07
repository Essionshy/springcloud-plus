package com.tingyu.springcloud.controller;

import com.tingyu.springcloud.commons.CommonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author essionshy
 * @Create 2020/3/28 9:39
 * @Version springcloud-plus
 */
@RestController
public class OrderController {

    private static final String SERVER_ADDRESS="http://springcloud-payment-service";

    @Resource
    private RestTemplate restTemplate;

    @Value("${server.port}")
    private String server;
    @GetMapping("/consumer/zk")
    public CommonResult get(){
        CommonResult commonResult = restTemplate.getForObject(SERVER_ADDRESS+"/payment/zk", CommonResult.class);
        return  commonResult;
    }

}
