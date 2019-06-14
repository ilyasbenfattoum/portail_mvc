package com.ilyas.ben.controllers.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ilyas.ben.entities.Demande_creation;
import com.ilyas.ben.services.IDemande_creationService;

@Controller
@RequestMapping(value="/register")
public class RegisterController {
	@Autowired
	private IDemande_creationService demandeService;
	
	
	@RequestMapping(value ="/", method= RequestMethod.GET)
	public String ajouterDemande(Model model) {
		Demande_creation demande=new Demande_creation();
		model.addAttribute("register", demande);
		return "client/register";
	}
	

	@RequestMapping(value ="/enregistrer")
	public String enregistrerDemande(Model model,Demande_creation demande) {
		demandeService.save(demande);
		
		return "redirect:/register/";
	} 
}
