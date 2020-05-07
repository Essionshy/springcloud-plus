package com.tingyu.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author essionshy
 * @Create 2020/3/29 17:36
 * @Version springcloud-plus
 */
@RestController
public class NacosController {

    @GetMapping(value = "/nacos/get")
    public String nacos(){

        return "welcome to use nacos server to you application";
    }
}
