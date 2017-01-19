package com.alibaba.dubbo.demo;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created by Administrator on 2017/1/17.
 */
@Service
public interface DemoService {
    String sayHello(String name);
}
