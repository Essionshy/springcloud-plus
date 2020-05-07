package com.tingyu.springcloud.service.impl;

import com.tingyu.springcloud.service.SendMessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @Author essionshy
 * @Create 2020/3/29 11:50
 * @Version springcloud-plus
 */
@Slf4j
@EnableBinding(Source.class)
public class SendMessageServiceImpl implements SendMessageService {
    @Resource
    private MessageChannel output;
    @Output(Source.OUTPUT)
    @Override
    public String send() {
        String serial=UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        log.info("发送了一条消息:{}",serial);
        return serial;
    }
}
