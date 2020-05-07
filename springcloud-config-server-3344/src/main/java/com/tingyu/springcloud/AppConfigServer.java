package com.tingyu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author essionshy
 * @Create 2020/3/28 17:30
 * @Version springcloud-plus
 */
@SpringBootApplication
@EnableConfigServer
public class AppConfigServer {
    public static void main(String[] args) {
        SpringApplication.run(AppConfigServer.class,args);
    }
}
