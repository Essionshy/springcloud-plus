package com.tingyu.springcloud.controller;

import com.tingyu.springcloud.commons.CommonResult;
import com.tingyu.springcloud.entities.Payment;
import com.tingyu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author essionshy
 * @Create 2020/3/27 23:15
 * @Version springcloud-plus
 */
@Slf4j
@RestController
public class PaymentController {

    @Resource
    private PaymentService paymentService;
    @GetMapping("/payment/get/{id}")
    public CommonResult get(@PathVariable("id") Integer id){

        Payment payment = paymentService.findById(id);
        if( payment !=null){
            return new CommonResult(200,"查询成功",payment);
        }else {
            return new CommonResult(404,"查询失败",null);
        }
    }

    /**
     *
     * @return
     */
    @PostMapping("/payment")
    public CommonResult<Integer> create(Payment payment){
        int retValue = paymentService.create(payment);
        if(retValue>1){
            log.info("写入数据库成功",payment);
            return new CommonResult<Integer>(200,"写入数据库成功",retValue);
        }else {
            return new CommonResult<Integer>(200,"写入数据库成功",null);
        }
    }

    @GetMapping("/payment/sleuth")
    public String sleuth(){
       return "hello ! this is a test request for sleuth ";
    }
}
