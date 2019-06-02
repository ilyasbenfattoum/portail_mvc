package com.ilyas.ben.controllers.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ilyas.ben.entities.Client;
import com.ilyas.ben.entities.Document;
import com.ilyas.ben.services.IClientService;
import com.ilyas.ben.services.IDocumentService;

@Controller
@RequestMapping(value="/documents")
public class DocumentsController {
	@Autowired
	private IDocumentService documentservice;
	
	@RequestMapping(value ="/")
	public String documents(Model model) {
		List<Document> documents= documentservice.selectAll();
		if (documents == null) {
			documents= new ArrayList<Document>();
		}
		model.addAttribute("documents", documents);
		return "client/documents";
	}
	
}
