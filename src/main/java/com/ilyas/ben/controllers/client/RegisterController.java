package com.ilyas.ben.controllers.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/register")
public class RegisterController {
	
	@RequestMapping(value ="/")
	public String home() {
		return "client/register";
	}
	
}
