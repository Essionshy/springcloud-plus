package com.tingyu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @Author essionshy
 * @Create 2020/3/28 0:32
 * @Version springcloud-plus
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Accessors(chain = true)
public class Order {
    private Integer id;

    private String name;
}
