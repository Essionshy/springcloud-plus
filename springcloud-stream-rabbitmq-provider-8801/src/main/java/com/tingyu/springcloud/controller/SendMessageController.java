package com.tingyu.springcloud.controller;

import com.tingyu.springcloud.service.SendMessageService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author essionshy
 * @Create 2020/3/29 12:01
 * @Version springcloud-plus
 */
@RestController
public class SendMessageController  {
    @Value("${server.port}")
    private String serverPort;

    @Resource
    private SendMessageService sendMessageService;

    @RequestMapping("/stream/send")
    public String send(){
        return sendMessageService.send()+"***********"+serverPort;
    }
}
