package com.tingyu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author essionshy
 * @Create 2020/3/28 10:15
 * @Version springcloud-plus
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AppProviderPayment8006 {
    public static void main(String[] args) {
        SpringApplication.run(AppProviderPayment8006.class,args);
    }
}
