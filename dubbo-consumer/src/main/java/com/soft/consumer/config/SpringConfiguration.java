package com.soft.consumer.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

/**
 * 主配置类
 * @description: SpringConfiguration
 * @author: Mr.Yin
 * @create: 2019-01-02 14:55
 **/
@Configurable
@ComponentScan({"com.soft.consumer"})             //指定扫描组件的包路径，可以减少扫描的时间。在主配置类上使用@ComponentScan注解。
public class SpringConfiguration {

}
