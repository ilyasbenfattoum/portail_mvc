package com.ilyas.ben.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/indexadmin")
public class IndexadminController {
	
	@RequestMapping(value ="/")
	public String home() {
		return "admin/index";
	}
	
}
