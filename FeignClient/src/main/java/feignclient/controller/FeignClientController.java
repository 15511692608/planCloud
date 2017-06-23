package feignclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by admin on 2017/6/23.
 */
@RestController
public class FeignClientController {

    @Resource
    private FeignClientService feignClientService;
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(@RequestParam String name){
        return feignClientService.hello(name);
    }
}
