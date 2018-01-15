package com.yyy.cloud.client.a.controller;

import com.netflix.appinfo.EurekaInstanceConfig;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: YRee
 * @data: 2018/1/15
 * @time: 下午6:14
 * @function:
 */
@RestController
@CommonsLog
public class ClientControllerA {
    @Autowired
    private EurekaInstanceConfig eurekaInstanceConfig;
//    @Value("${server.port}")
//    private int serverPort = 0;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        log.info(String.format("/hello, instanceId:%s, host:%s", eurekaInstanceConfig.getInstanceId(), eurekaInstanceConfig.getHostName(false)));
        return "Hello, Spring Cloud! My port is " ;
        //s+ String.valueOf(serverPort);
    }

}
