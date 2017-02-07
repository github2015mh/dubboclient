package com.alibaba.dubbo.demo;

import com.alibaba.dubbo.rpc.RpcException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/1/20.
 */
//@Service
public class DemoServiceStub implements DemoService {

    @Autowired
    private final DemoService demoService;

//    public DemoServiceStub(){}

    public DemoServiceStub(DemoService demoService){
        this.demoService = demoService;
    }

    @Override
    public Map sayHello(String name) {
        System.out.println(this.getClass().getName()+" sayHello() executing");
        Map<String,Object> ret = new HashMap<>();
        if(name!=null&&!name.equals("ffc")){
            try{
                System.out.println("invoking remote sayHello method");
                ret = demoService.sayHello(name);
                return ret;
            }catch (RpcException e){
                e.printStackTrace();
                ret.put("data", "nonono，error<br>" + e.getMessage());
                ret.put("retCode", "0001");
                ret.put( "retMsg","error");
            }
        }
        ret.put("data","福福福consumer");
        ret.put("retCode","0002");
        ret.put("retMsg","succ");
        return ret;
    }
}
