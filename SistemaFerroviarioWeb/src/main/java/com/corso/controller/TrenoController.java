package com.corso.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.corso.services.TrenoService;
import corso.model.Treno;

@Controller
@RequestMapping("/home/treno")
public class TrenoController {
	
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
		//TrenoService tService = new TrenoService();
		//tService.addTreno(treno);
		m.addAttribute("messaggio", "Treno inserito con successo!");
		return "formAddTreno";
	}
	
	@GetMapping("/builderTreno")
	public String builderTreno() {
		return "trenoBuilder";
		
	}
	
	@GetMapping("/azienda1")
		public String getFirstCompany(@RequestParam String sequenza,Model m,HttpSession session) throws Exception {
			TrenoService service = new TrenoService();
			Treno treno = service.addTreno(sequenza);
			session.setAttribute("treno", treno);
			session.setAttribute("sequenza", sequenza);
			
			m.addAttribute("sequenza",sequenza);
			return "/azienda1";
		}
	
	
	@GetMapping("/visualizzaTreno")
	public String printTreno() {
		return "/visualizzaTreno";
	}

}
