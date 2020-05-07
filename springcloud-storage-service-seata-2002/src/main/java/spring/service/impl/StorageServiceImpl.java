package spring.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import spring.dao.StorageDao;
import spring.service.StorageService;

import javax.annotation.Resource;

/**
 * @Author essionshy
 * @Create 2020/3/31 13:15
 * @Version springcloud-plus
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;
    @Override
    public void decrease(Long userId, Integer count) {

        storageDao.decrease(userId,count);
    }
}
