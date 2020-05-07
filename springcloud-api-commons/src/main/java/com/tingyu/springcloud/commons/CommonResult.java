package com.tingyu.springcloud.commons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @Author essionshy
 * @Create 2020/3/27 23:19
 * @Version springcloud-plus
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Accessors(chain = true)
public class CommonResult<T> {
    private Integer code;

    private String message;

    private T data;

    public CommonResult(Integer code, String message) {
        this(code,message,null);
    }
}
