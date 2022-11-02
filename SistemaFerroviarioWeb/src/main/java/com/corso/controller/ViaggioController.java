package com.corso.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.corso.services.ViaggioService;
import corso.model.Viaggio;


@Controller
@RequestMapping("/home/viaggio")
public class ViaggioController {

	@GetMapping("/allViaggi")
	public String allViaggi(Model m){
		ViaggioService v= new ViaggioService();
		List<Viaggio> lista= v.getAllViaggi();
		m.addAttribute("dimensione", lista.size());
		m.addAttribute("lista",lista);
		return "/viaggio";
	}
	
	@GetMapping("/formAddViaggio")
	public String formAddViaggio(Model m)
	{
		m.addAttribute("viaggio", new Viaggio());
		return "formAddViaggio";
	}
	
	@GetMapping("/addViaggio")
	public String addViaggio(@ModelAttribute("viaggio") Viaggio viaggio)
	{
		ViaggioService vService = new ViaggioService();
		vService.add(viaggio);
		
		return "formAddViaggio";
	}
	
	
}
