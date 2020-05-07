package com.tingyu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author essionshy
 * @Create 2020/3/28 10:28
 * @Version springcloud-plus
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AppConsulConsumerOrder {
    public static void main(String[] args) {
        SpringApplication.run(AppConsulConsumerOrder.class,args);
    }
}
