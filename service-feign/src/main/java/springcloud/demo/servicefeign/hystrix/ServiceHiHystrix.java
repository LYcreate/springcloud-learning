package springcloud.demo.servicefeign.hystrix;

import org.springframework.stereotype.Component;
import springcloud.demo.servicefeign.service.ServiceHi;

/**
 * @ClassName ServiceHiHystrix
 * @Description TODO
 * @Author Asus
 * @Date 2019/7/20 0:24
 */
@Component
public class ServiceHiHystrix implements ServiceHi {
    @Override
    public String satHiFromOneClient(String name) {
        return "hi," + name + ",sorry for error!";
    }
}
