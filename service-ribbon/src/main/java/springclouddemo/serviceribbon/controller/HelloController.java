package springclouddemo.serviceribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springclouddemo.serviceribbon.service.HelloService;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author Asus
 * @Date 2019/7/19 20:34
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam(value = "name") String name) {
        return helloService.hiService(name);
    }
}
