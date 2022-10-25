package com.corso.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.corso.services.DipendenteService;

import corso.model.Dipendente;


@Controller
public class DipendenteController {
	
	@GetMapping("/allDipendenti")
	public String allDip(Model m)
	{
		DipendenteService d= new DipendenteService();
		List<Dipendente> lista= d.getAllDipendenti();
		m.addAttribute("lista",lista);
		return "/dipendente";
	}

}
