package com.corso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.corso.services.TrenoService;
import corso.model.Treno;


@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/infoTreno")
	public String infoTreno(Model m)
	{
		m.addAttribute("treno", new Treno());
		return "formTreno";
	}

	@GetMapping("/getTreno")
	public String homeFerrovia(Model m, @ModelAttribute("treno") Treno treno) {
		TrenoService tService = new TrenoService();
		treno = tService.findTreno(treno.getIdTreno());
		m.addAttribute("result", treno);
		return "treno";
	}
	
	@GetMapping("/formAddTreno")
	public String formAddTreno(Model m)
	{
		m.addAttribute("treno", new Treno());
		return "formAddTreno";
	}
	
	@GetMapping("/addTreno")
	public String addTreno(Model m, @ModelAttribute("treno") Treno treno)
	{
		TrenoService tService = new TrenoService();
		tService.addTreno(treno);
		m.addAttribute("messaggio", "Treno inserito con successo!");
		return "formAddTreno";
	}
	
	
}