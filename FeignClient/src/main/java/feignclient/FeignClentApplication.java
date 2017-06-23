package feignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by admin on 2017/6/23.
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
public class FeignClentApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignClentApplication.class, args);
    }

}
