package com.tingyu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author essionshy
 * @Create 2020/3/29 11:48
 * @Version springcloud-plus
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AppProviderStreamRabbit {
    public static void main(String[] args) {
        SpringApplication.run(AppProviderStreamRabbit.class,args);
    }
}
