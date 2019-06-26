package com.ilyas.ben.controllers.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/factures/2")
public class FactureController2 {
	
	@RequestMapping(value ="/")
	public String home() {
		return "client/factures2";
	}
	
}