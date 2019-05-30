package com.ilyas.ben.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/forgot-password")
public class ForgotpasswordController {
	
	@RequestMapping(value ="/")
	public String home() {
		return "client/forgot-password";
	}
	
}
