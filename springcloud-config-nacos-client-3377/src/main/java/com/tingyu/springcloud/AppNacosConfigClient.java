package com.tingyu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author essionshy
 * @Create 2020/3/29 20:00
 * @Version springcloud-plus
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AppNacosConfigClient {
    public static void main(String[] args) {
        SpringApplication.run(AppNacosConfigClient.class,args);
    }
}
