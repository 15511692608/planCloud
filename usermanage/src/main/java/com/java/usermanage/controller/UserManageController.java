package com.java.usermanage.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * Created by admin on 2017/6/23.
 */
@RestController
public class UserManageController {
    @Resource
    private DiscoveryClient client;

    private Logger log= LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/hello")
    public String showname(String name){
        //输出服务信息
        ServiceInstance instance = client.getLocalServiceInstance();
        log.info("url={},id={},result={}",instance.getUri(),instance.getServiceId(),name);
        return "Hello "+name;
    }

}
