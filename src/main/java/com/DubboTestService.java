package com;

//import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.demo.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/1/3.
 */
@Service
public class DubboTestService {

    @Autowired
    private DemoService demoService;

    public String callDubboService(String username){
        return demoService.sayHello(username).get("data").toString();
    }
}
