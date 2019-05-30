package com.ilyas.ben.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/documents")
public class DocumentsController {
	
	@RequestMapping(value ="/")
	public String home() {
		return "client/documents";
	}
	
}
