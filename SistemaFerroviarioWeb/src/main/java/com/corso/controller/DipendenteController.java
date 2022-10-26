package com.corso.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.corso.services.DipendenteService;

import corso.model.Dipendente;


@Controller
@RequestMapping("/home/dipendente")
public class DipendenteController {
	
	@GetMapping("/allDipendenti")
	public String allDip(Model m)
	{
		DipendenteService d= new DipendenteService();
		List<Dipendente> lista= d.getAllDipendenti();
		m.addAttribute("dimensione", lista.size());
		m.addAttribute("lista",lista);
		return "/dipendente";
	}

}
