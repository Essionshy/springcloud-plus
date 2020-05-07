package com.tingyu.springcloud.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @Author essionshy
 * @Create 2020/3/28 14:22
 * @Version springcloud-plus
 */
@Slf4j
@Component
public class GlobalLogFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        //1、设定过滤规则，请求中带username参数的请求才能够被访问，否则拒绝

        String username = exchange.getRequest().getQueryParams().getFirst("username");
        if(username == null){
            log.info("非法用户，拒绝访问");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        return  chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
