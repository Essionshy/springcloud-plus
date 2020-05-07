package com.tingyu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author essionshy
 * @Create 2020/3/28 12:07
 * @Version springcloud-plus
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AppGateway9527 {
    public static void main(String[] args) {
        SpringApplication.run(AppGateway9527.class,args);
    }
}
