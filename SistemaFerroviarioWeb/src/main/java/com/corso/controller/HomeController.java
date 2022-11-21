package com.corso.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.corso.services.ViaggioService;

import corso.model.Viaggio;
import corso.model.filter.ViaggioFilter;


@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home()
	{
		
		return "home";
	
	}
	
	@GetMapping("/homePage")
	public String homePage() {
		return "prova";
	}
	
	@GetMapping("/homeTuttiViaggi")
	public String alliViaggi(Model m){
		ViaggioService v= new ViaggioService();
		List<Viaggio> lista= v.getAllViaggi();
		m.addAttribute("dimensione", lista.size());
		m.addAttribute("lista",lista);
		m.addAttribute("emp", new ViaggioFilter());
		return "/homeViaggi";
	}
	
	@GetMapping("/findViaggiByFilter")
	public String findViaggiByFilter(@ModelAttribute ViaggioFilter vf,  Model m) {
		ViaggioService v= new ViaggioService();
		List<Viaggio> lista= v.getFindByFilter(vf);
		m.addAttribute("dimensione", lista.size());
		m.addAttribute("lista",lista);
		return "/viaggioPrint";		
}
	
	@GetMapping("/lavoraConNoi")
	public String lavorapernoi() {
		return "lavoraNoi";
	}
	
	
}