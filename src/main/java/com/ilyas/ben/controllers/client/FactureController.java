package com.ilyas.ben.controllers.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/factures/1")
public class FactureController {
	
	@RequestMapping(value ="/")
	public String home() {
		
		return "client/factures1";
	}
	
}