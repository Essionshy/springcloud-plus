package com.tingyu.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Author essionshy
 * @Create 2020/3/30 12:32
 * @Version springcloud-plus
 */
@RestController
public class FlowLimitController {

    @GetMapping("/sentinel/testA")
    public String testA(){
        return "---------------->testA";
    }
    @GetMapping("/sentinel/testB")
    public String testB(){
        return "---------------> testB";
    }
    @GetMapping("/sentinel/testC")
    public String testC(){
        try {
            TimeUnit.MICROSECONDS.sleep(1000L);} catch (InterruptedException e) { e.printStackTrace();}
        return "---------------> testC";
    }
}
