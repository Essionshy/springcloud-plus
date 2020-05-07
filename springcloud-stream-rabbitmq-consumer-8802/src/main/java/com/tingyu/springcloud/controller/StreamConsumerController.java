package com.tingyu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;

/**
 * @Author essionshy
 * @Create 2020/3/29 12:09
 * @Version springcloud-plus
 */
@EnableBinding(Sink.class)
@Slf4j
public class StreamConsumerController {

    @Value("${server.port}")
    private  String serverPort;

    @Input(Sink.INPUT)
    @StreamListener
    public void consumer(Message<String> message){
        log.info("消费者1号------->：{}   port:{}",message,serverPort);
    }

}
