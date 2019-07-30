package com.javalsj.datacenter.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface MsgCenterApi {
	
	@PostMapping("/api/msgcenter/v1/push")
	public String saveSubmit(@RequestBody String body);
	
}
