package feignclient.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Created by admin on 2017/6/23.
 */
@FeignClient(value = "api-gate-way",fallback = FeignClientHystrixService.class)
public interface FeignClientService {

    @RequestMapping(value = "/mycall/hello",method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

}
