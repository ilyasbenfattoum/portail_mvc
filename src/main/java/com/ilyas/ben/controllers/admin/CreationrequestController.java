package com.ilyas.ben.controllers.admin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ilyas.ben.entities.Client;
import com.ilyas.ben.entities.Demande_creation;
import com.ilyas.ben.services.IDemande_creationService;

@Controller
@RequestMapping(value="/creation-requestadmin")
public class CreationrequestController {
	@Autowired
	private IDemande_creationService demande_creationService;
	
	@RequestMapping(value ="/")
	public String creation(Model model) {
		List<Demande_creation> demandescre= demande_creationService.selectAll();
		if (demandescre == null) {
			demandescre= new ArrayList<Demande_creation>();
		}
		model.addAttribute("demandescre", demandescre);
		return "admin/creation-request";
	}
	
}
