package com.ilyas.ben.controllers.admin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ilyas.ben.entities.Client;
import com.ilyas.ben.services.IClientService;

@Controller
@RequestMapping(value="/clientadmin")
public class ClientadminController {
	@Autowired
	private IClientService clientservice;
	
	@RequestMapping(value ="/")
	public String client(Model model) {
		List<Client> clients= clientservice.selectAll();
		if (clients == null) {
			clients= new ArrayList<Client>();
		}
		model.addAttribute("clients", clients);
		return "admin/client";
	}
	
}
