package com.tingyu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author essionshy
 * @Create 2020/3/28 23:46
 * @Version springcloud-plus
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${config.info}") //读取外部配置文件中属性
    private  String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo(){
        return configInfo;
    }

}
