package springcloud.demo.servicefeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springcloud.demo.servicefeign.service.ServiceHi;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author Asus
 * @Date 2019/7/19 21:30
 */
@RestController
public class HelloController {
    @Autowired
    private ServiceHi serviceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam(value = "name") String name) {
        return serviceHi.satHiFromOneClient(name);
    }
}
