package com.tingyu.springcloud.controller;

import com.tingyu.springcloud.commons.CommonResult;
import com.tingyu.springcloud.entities.Order;
import com.tingyu.springcloud.serivce.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author essionshy
 * @Create 2020/3/28 1:15
 * @Version springcloud-plus
 */
@Slf4j
@RestController
public class OrderController {

    private  static  final String SERVER_ADDR="http://springcloud-payment-service";
    @Resource
    private RestTemplate restTemplate;

    @Resource
    private OrderService orderService;
    @GetMapping("/order/{id}")
    public CommonResult get(@PathVariable("id") Integer id){
        Order order = orderService.getById(id);
        if( order !=null){
            return new CommonResult(200,"查询成功",order);
        }else {
            return new CommonResult(404,"查询失败",null);
        }
    }

    /**
     *
     * @return
     */
    @PostMapping("/order")
    public CommonResult<Integer> create(Order order){
        int retValue = orderService.create(order);
        if(retValue>1){
            log.info("写入数据库成功",order);
            return new CommonResult<Integer>(200,"写入数据库成功",retValue);
        }else {
            return new CommonResult<Integer>(200,"写入数据库成功",null);
        }
    }

    @GetMapping("/consumer/order/sleuth")
    public String sleuth(){
        return restTemplate.getForObject(SERVER_ADDR+"/payment/sleuth",String.class);
    }

}
