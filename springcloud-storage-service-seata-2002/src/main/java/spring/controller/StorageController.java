package spring.controller;

import com.tingyu.springcloud.commons.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.service.StorageService;

import javax.annotation.Resource;

/**
 * @Author essionshy
 * @Create 2020/3/31 13:17
 * @Version springcloud-plus
 */
@RestController
@Slf4j
public class StorageController {

    @Resource
    private StorageService storageService;

    @PostMapping(value = "/account/decrease")
    public CommonResult decrease(@RequestParam("userId")Long userId, @RequestParam("count")Integer count){
        storageService.decrease(userId,count);
        return new CommonResult(200,"扣减库存成功");
    }
}
