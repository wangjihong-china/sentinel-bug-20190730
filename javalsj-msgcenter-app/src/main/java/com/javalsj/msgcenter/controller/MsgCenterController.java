package com.javalsj.msgcenter.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgCenterController {

	@PostMapping("/api/msgcenter/v1/push")
	public String saveSubmit() {
		return "收到";
	}
}
