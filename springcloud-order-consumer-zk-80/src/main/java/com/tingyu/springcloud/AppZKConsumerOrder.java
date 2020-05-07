package com.tingyu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author essionshy
 * @Create 2020/3/28 9:38
 * @Version springcloud-plus
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AppZKConsumerOrder {
    public static void main(String[] args) {
        SpringApplication.run(AppZKConsumerOrder.class,args);
    }
}
