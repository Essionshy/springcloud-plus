package com.tingyu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author essionshy
 * @Create 2020/3/30 12:31
 * @Version springcloud-plus
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AppSentinelService8401 {
    public static void main(String[] args) {
        SpringApplication.run(AppSentinelService8401.class,args);
    }
}
