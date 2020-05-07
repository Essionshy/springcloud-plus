package com.tingyu.spring.service.impl;

import com.tingyu.spring.dao.AccountDao;
import com.tingyu.spring.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @Author essionshy
 * @Create 2020/3/31 13:15
 * @Version springcloud-plus
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;
    @Override
    public void decrease(Long userId, BigDecimal money) {

        accountDao.decrease(userId,money);
    }
}
