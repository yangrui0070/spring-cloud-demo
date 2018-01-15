package com.yyy.cloud.client.a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: YRee
 * @data: 2018/1/15
 * @time: 下午6:02
 * @function:
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudClientAApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudClientAApplication.class, args);
    }
}
