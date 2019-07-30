package com.javalsj.datacenter.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.javalsj.datacenter.api.MsgCenterApi;

@FeignClient(name="msgcenter-service")
public interface MsgCenterFeignClient extends MsgCenterApi{

}
