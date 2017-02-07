package com.alibaba.dubbo.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/1/20.
 */
public class DemoServiceMock implements DemoService{

    @Override
    public Map sayHello(String name) {
        Map<String,Object> ret = new HashMap<>();
        ret.put("data","容错数据,远程服务出错时执行");
        ret.put("retCode","0002");
        ret.put("retMsg","succ");
        return ret;
    }
}
