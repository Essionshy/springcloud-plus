package com.tingyu.springcloud;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author essionshy
 * @Create 2020/3/31 9:49
 * @Version springcloud-plus
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoDataSourceProxy
@EnableFeignClients
public class AppOrderServiceSeata2001 {
    public static void main(String[] args) {
        SpringApplication.run(AppOrderServiceSeata2001.class,args);
    }
}
