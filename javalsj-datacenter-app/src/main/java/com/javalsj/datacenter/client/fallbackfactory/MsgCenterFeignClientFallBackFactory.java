package com.javalsj.datacenter.client.fallbackfactory;

import org.springframework.stereotype.Component;

import com.javalsj.datacenter.client.MsgCenterFeignClient;

import feign.hystrix.FallbackFactory;

@Component
public class MsgCenterFeignClientFallBackFactory implements FallbackFactory<MsgCenterFeignClient> {

	@Override
	public MsgCenterFeignClient create(Throwable cause) {
		return new MsgCenterFeignClient() {
			@Override
			public String saveSubmit() {
				cause.printStackTrace();
				System.err.println("消息中心服务熔断！");
				return null;
			}
		};
	}

}
