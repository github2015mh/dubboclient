package com.alibaba.dubbo.demo;

import com.alibaba.dubbo.config.annotation.Service;

import java.util.Map;

/**
 * Created by Administrator on 2017/1/17.
 */
@Service
public interface DemoService {
    Map sayHello(String name);
}
