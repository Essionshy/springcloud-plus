package com.tingyu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author essionshy
 * @Create 2020/3/28 22:25
 * @Version springcloud-plus
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AppConfigClient3356 {
    public static void main(String[] args) {
        SpringApplication.run(AppConfigClient3356.class,args);
    }
}
