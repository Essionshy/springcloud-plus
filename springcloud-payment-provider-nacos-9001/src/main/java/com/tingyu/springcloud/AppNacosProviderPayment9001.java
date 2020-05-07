package com.tingyu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author essionshy
 * @Create 2020/3/29 17:34
 * @Version springcloud-plus
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AppNacosProviderPayment9001 {
    public static void main(String[] args) {
        SpringApplication.run(AppNacosProviderPayment9001.class,args);
    }
}
