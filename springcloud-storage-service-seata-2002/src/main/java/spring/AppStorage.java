package spring;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author essionshy
 * @Create 2020/3/31 13:03
 * @Version springcloud-plus
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableAutoDataSourceProxy
public class AppStorage {
    public static void main(String[] args) {
        SpringApplication.run(AppStorage.class,args);
    }
}
