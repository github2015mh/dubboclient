package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/1/3.
 */
@RestController
public class DubboController {

    @Autowired
    private DubboTestService dubboTestService;

    @RequestMapping("/")
    String home(String u) {
        return dubboTestService.callDubboService(u);
//        return "Hello World!";
    }

}
