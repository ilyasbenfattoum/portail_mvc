package com.ilyas.ben.controllers.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/about")
public class ContactController {
	
	@RequestMapping(value ="/")
	public String home() {
		return "client/about";
	}
	
}
