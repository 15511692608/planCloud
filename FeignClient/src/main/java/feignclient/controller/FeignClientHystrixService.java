package feignclient.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by admin on 2017/6/23.
 */
@Component
public class FeignClientHystrixService implements FeignClientService{
    @Override
    public String hello(@RequestParam String name) {
        return name+"is not found";
    }
}
