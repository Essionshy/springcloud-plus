package com.tingyu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author essionshy
 * @Create 2020/3/28 22:23
 * @Version springcloud-plus
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AppConfigClient3355 {
    public static void main(String[] args) {
        SpringApplication.run(AppConfigClient3355.class,args);
    }
}
