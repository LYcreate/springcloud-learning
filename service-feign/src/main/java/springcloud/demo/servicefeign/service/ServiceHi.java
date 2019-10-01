package springcloud.demo.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import springcloud.demo.servicefeign.hystrix.ServiceHiHystrix;

/**
 * ServiceHi
 * Feign是一个声明式的伪Http客户端，它使得写Http客户端变得更简单。
 * Feign 采用的是基于接口的注解
 * Feign 整合了ribbon，具有负载均衡的能力
 * 整合了Hystrix，具有熔断的能力
 *
 * @author Asus
 * @date 2019/7/19 21:28
 */
@FeignClient(value = "eureka-client", fallback = ServiceHiHystrix.class)
public interface ServiceHi {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String satHiFromOneClient(@RequestParam(value = "name") String name);
}
