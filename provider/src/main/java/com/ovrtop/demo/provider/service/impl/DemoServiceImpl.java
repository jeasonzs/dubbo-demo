package com.ovrtop.demo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ovrtop.demo.provider.api.service.IDemoService;

@Service
public class DemoServiceImpl implements IDemoService {
    @Override
    public String sayHello(String name) {
        return "Your name is :" + name;
    }
}
