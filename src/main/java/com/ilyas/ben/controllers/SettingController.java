package com.ilyas.ben.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/setting")
public class SettingController {
	
	@RequestMapping(value ="/")
	public String home() {
		return "client/setting";
	}
	
}
