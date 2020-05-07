package com.tingyu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @Author essionshy
 * @Create 2020/3/27 22:52
 * @Version springcloud-plus
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Payment {

    private  Integer id;

    private BigDecimal amount;

    private Integer deleted;

    private Timestamp createTime;

    private Timestamp updateTime;
}
