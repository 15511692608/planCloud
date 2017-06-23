package ZuulClient;

import ZuulClient.Filter.GatewayFilter;
import com.netflix.zuul.ZuulFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ZuulClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulClientApplication.class, args);
	}

	/**
	 * 这里的方法返回值，不能写成com.netflix.zuul.IZuulFilter
	 * 可以写成com.netflix.zuul.ZuulFilter，或者com.jadyer.demo.GatewayFilter
	 * 虽然语法上允许返回IZuulFilter，但实际测试发现返回IZuulFilter时，网关功能却没有生效
	 */
	@Bean
	public ZuulFilter gatewayFilter() {
		return new GatewayFilter();
	}

}
