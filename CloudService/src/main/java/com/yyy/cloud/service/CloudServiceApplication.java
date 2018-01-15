package com.yyy.cloud.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: YRee
 * @data: 2018/1/15
 * @time: 下午6:02
 * @function:
 */
@EnableEurekaServer
@SpringBootApplication
public class CloudServiceApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(CloudServiceApplication.class).web(true).run(args);
    }
}
