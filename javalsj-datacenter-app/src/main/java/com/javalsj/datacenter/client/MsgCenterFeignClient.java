package com.javalsj.datacenter.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.javalsj.datacenter.api.MsgCenterApi;
import com.javalsj.datacenter.client.fallbackfactory.MsgCenterFeignClientFallBackFactory;

@FeignClient(name = "msgcenter-service", fallbackFactory = MsgCenterFeignClientFallBackFactory.class)
public interface MsgCenterFeignClient extends MsgCenterApi {

}
