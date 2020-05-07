package spring.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author essionshy
 * @Create 2020/3/31 13:13
 * @Version springcloud-plus
 */
@Mapper
public interface StorageDao {
    /**
     * 扣减账户
     * @param userId
     * @param count
     */
    void decrease(@Param("userId") Long userId, @Param("count") Integer count);
}
