package com.soft.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.soft.api.service.IProviderDemo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Reference
    private IProviderDemo providerDemo;

    @RequestMapping(value = "/callInterfase")
    public String callInterfase() {
        String hello = providerDemo.providerReturnString("consumer test");
        System.out.println(providerDemo.providerReturnString("consumer print"));
        return hello;
    }
}
