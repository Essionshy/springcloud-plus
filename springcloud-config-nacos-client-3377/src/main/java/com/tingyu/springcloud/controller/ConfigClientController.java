package com.tingyu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author essionshy
 * @Create 2020/3/29 20:02
 * @Version springcloud-plus
 */
@RestController
@Slf4j
@RefreshScope //保证自动刷新
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;
    @GetMapping("/config/info")
    public String configInfo(){
        return configInfo;
    }
}
