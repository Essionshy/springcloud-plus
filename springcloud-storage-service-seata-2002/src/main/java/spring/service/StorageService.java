package spring.service;

import org.apache.ibatis.annotations.Param;

/**
 * @Author essionshy
 * @Create 2020/3/31 13:15
 * @Version springcloud-plus
 */
public interface StorageService {
    /**
     * 扣减账户
     * @param userId
     * @param money
     */
    void decrease(@Param("userId") Long userId, @Param("money") Integer money);
}
