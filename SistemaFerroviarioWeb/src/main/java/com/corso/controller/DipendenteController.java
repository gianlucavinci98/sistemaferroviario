package com.corso.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@GetMapping("/moreDipendenti")
	public String findDip(@RequestParam List<Integer> id, Model m)
	{
		DipendenteService d= new DipendenteService();
		List<Dipendente> lista1= d.getFindMoreDipendente(id);
		m.addAttribute("dimensione", lista1.size());
		m.addAttribute("lista",lista1);
		return "dipendente";
	}


}
