package com.soft.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.soft.api.service.IProviderDemo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@Api(value = "消费者")
public class ConsumerController {

    @Reference
    private IProviderDemo providerDemo;

    @ResponseBody
    @RequestMapping(value = "/callInterfase", produces = "text/plain;charset=UTF-8", method = RequestMethod.GET)
    @ApiOperation(value = "消费者接口调用", notes = "消费者接口调用")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "info", value = "info", required = false, dataType = "String")
    })
    public String callInterfase(String info) {
        String hello = providerDemo.providerReturnString("consumer test " + info);
        System.out.println(providerDemo.providerReturnString("consumer print " + info));
        return hello;
    }
}
