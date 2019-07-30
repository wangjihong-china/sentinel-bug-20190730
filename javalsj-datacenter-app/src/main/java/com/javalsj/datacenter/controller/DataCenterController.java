package com.javalsj.datacenter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javalsj.datacenter.api.MsgCenterApi;

@RestController
public class DataCenterController {
	
	@Autowired
	private MsgCenterApi msgCenterApi;
	
	@PostMapping("/api/datacenter/v1/pushMsg")
	public String pushMsg() {
		String saveSubmit = msgCenterApi.saveSubmit();
		return saveSubmit;
	}
	
}
