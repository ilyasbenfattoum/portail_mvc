package com.ilyas.ben.controllers.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ilyas.ben.entities.Demande_creation;
import com.ilyas.ben.entities.Demande_modification;
import com.ilyas.ben.services.IDemande_creationService;
import com.ilyas.ben.services.IDemande_modificationService;

@Controller
@RequestMapping(value="/profile")
public class ProfileController {
	
	@Autowired
	private IDemande_modificationService demandeService;
	
	
	@RequestMapping(value ="/", method= RequestMethod.GET)
	public String ajouterDemandemodif(Model model) {
		Demande_modification demande=new Demande_modification();
		model.addAttribute("update", demande);
		return "client/profile";
	}
	

	@RequestMapping(value ="/update")
	public String enregistrerDemande(Model model,Demande_modification demande) {
		demandeService.save(demande);
		
		return "redirect:/profile/";
	}
}
