package com.soft.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.soft.api.service.IProviderDemo;
import org.springframework.stereotype.Component;

/**
 * dubbo 服务层测试
 * @author suphowe
 */
//使用com.alibaba.dubbo.config.annotation.Service,作用是暴露服务,不要使用Spring中的@Service
@Service
@Component
public class ProviderDemoImpl implements IProviderDemo {

    @Override
    public String providerReturnString(String name) {
        return "Provider Return:".concat(name);
    }

}
