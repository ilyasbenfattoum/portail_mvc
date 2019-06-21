package com.ilyas.ben.controllers.admin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ilyas.ben.entities.Client;
import com.ilyas.ben.entities.Demande_creation;
import com.ilyas.ben.entities.Demande_modification;
import com.ilyas.ben.services.IClientService;
import com.ilyas.ben.services.IDemande_creationService;

@Controller
@RequestMapping(value="/clientadmin")
public class ClientadminController {
	@Autowired
	private IClientService clientservice;
	
	@Autowired
	private IDemande_creationService demandeservice;
	
	@RequestMapping(value ="/")
	public String client(Model model) {
		List<Client> clients= clientservice.selectAll();
		if (clients == null) {
			clients= new ArrayList<Client>();
		}
		model.addAttribute("clients", clients);
		return "admin/client";
	}
	
	@RequestMapping(value ="/save/{idDemande}")
	public String enregistrerDemande(Model model,@PathVariable Long idDemande) {
		if (idDemande != null) {
			Demande_creation demande= demandeservice.getById(idDemande);
			if (demande != null) {
				Client client=new Client(demande.getNom_prenom(), demande.getPassword(),
						demande.getEmail(), demande.getAdresse_client(), demande.getVille(), demande.getPays());
				
				clientservice.save(client);
			}
		}
		
		
		
		return "redirect:/clientadmin/";
	}
	@RequestMapping(value ="/delete/{idDemande}")
	public String deleteDemande(Model model,@PathVariable Long idDemande) {
		if (idDemande != null) {
			demandeservice.remove(idDemande);
			
		}	
		
		return "redirect:/creation-requestadmin/";
	}
	
}
