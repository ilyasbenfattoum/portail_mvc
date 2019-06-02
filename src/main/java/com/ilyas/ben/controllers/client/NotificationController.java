package com.ilyas.ben.controllers.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/notification")
public class NotificationController {
	
	@RequestMapping(value ="/")
	public String home() {
		return "client/notification";
	}
	
}
