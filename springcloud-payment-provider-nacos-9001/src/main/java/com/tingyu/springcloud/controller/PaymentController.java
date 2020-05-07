package com.tingyu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author essionshy
 * @Create 2020/3/29 17:36
 * @Version springcloud-plus
 */
@RestController
public class PaymentController {

    @Value("server.port")
    private String serverPort;

    @GetMapping(value = "/payment/get/{id}")
    public String get(@PathVariable("id") Integer id){
        return "welcome to use nacos server  to you application ---->"+serverPort;
    }
}
