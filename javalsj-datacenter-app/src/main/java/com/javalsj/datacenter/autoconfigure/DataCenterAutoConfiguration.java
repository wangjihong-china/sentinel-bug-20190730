package com.javalsj.datacenter.autoconfigure;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @description 消息中心客户端自动配置类
 * @author WANGJIHONG
 * @date 2019年6月25日 上午9:24:49 
 * @Copyright 版权所有 (c) jiuqi.com.cn
 * @memo 无备注说明
 */
@Configuration
@ComponentScan({"com.javalsj.datacenter"})
@EnableFeignClients({"com.javalsj.datacenter"})
public class DataCenterAutoConfiguration {

}
