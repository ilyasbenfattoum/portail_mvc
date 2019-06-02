package com.ilyas.ben.controllers.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/login")
public class LoginController {
	
	@RequestMapping(value ="/")
	public String home() {
		return "login/login";
	}
	
}
