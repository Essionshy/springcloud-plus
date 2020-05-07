package com.tingyu.springcloud.controller;

import com.tingyu.springcloud.commons.CommonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author essionshy
 * @Create 2020/3/28 9:06
 * @Version springcloud-plus
 */
@RestController
//@Slf4j
public class PaymentController {

    @Value("${spring.cloud.zookeeper.connect-string}")
    private String zkAddress;

    @GetMapping("/payment/zk")
    public CommonResult get(){
        String result="成功注册进Zookeeper"+zkAddress+System.currentTimeMillis();
        return  new CommonResult(200,"",result);
    }

}
