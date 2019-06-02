package com.ilyas.ben.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/profileadmin")
public class profileadminController {
	
	@RequestMapping(value ="/")
	public String home() {
		return "admin/profile";
	}
	
}
