package com.tingyu.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author essionshy
 * @Create 2020/3/29 17:43
 * @Version springcloud-plus
 */
@RestController
public class ConsumerOrderController {


    private static  final String serverAddr="http://springcloud-alibaba-nacos-provider-service";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/nacos/get")
    public String get(Integer id){
        return  restTemplate.getForObject(serverAddr+"/payment/get"+id,String.class);
    }
}
