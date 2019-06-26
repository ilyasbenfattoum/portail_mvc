package com.ilyas.ben.controllers.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/factures/3")
public class FactureController3 {
	
	@RequestMapping(value ="/")
	public String home() {
		return "client/factures3";
	}
	
}