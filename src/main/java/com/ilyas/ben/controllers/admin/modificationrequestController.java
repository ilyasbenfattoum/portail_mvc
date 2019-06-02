package com.ilyas.ben.controllers.admin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ilyas.ben.entities.Client;
import com.ilyas.ben.entities.Demande_modification;
import com.ilyas.ben.services.IClientService;
import com.ilyas.ben.services.IDemande_modificationService;

@Controller
@RequestMapping(value="/modification-requestadmin")
public class modificationrequestController {
	@Autowired
	private IDemande_modificationService demande_modificationService;
	@RequestMapping(value ="/")
	public String modification(Model model) {
		List<Demande_modification> demande_modif= demande_modificationService.selectAll();
		if (demande_modif == null) {
			demande_modif= new ArrayList<Demande_modification>();
		}
		model.addAttribute("demande_modif", demande_modif);
		
		return "admin/modification-request";
	}
	
}
