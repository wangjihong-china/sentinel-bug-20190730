package com.javalsj.datacenter.api;

import org.springframework.web.bind.annotation.PostMapping;

public interface MsgCenterApi {
	
	@PostMapping("/api/msgcenter/v1/push")
	public String saveSubmit();
	
}
