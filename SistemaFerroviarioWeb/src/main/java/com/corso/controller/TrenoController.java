package com.corso.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String homeFerrovia(Model m, @ModelAttribute("treno") Treno treno,HttpSession session) {
		TrenoService tService = new TrenoService();
		treno = tService.findTreno(treno.getIdTreno());
		session.setAttribute("treno", treno);
		return "visualizzaTreno";
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
			return "/azienda1";
		}
	
	
	@GetMapping("/visualizzaTreno")
	public String printTreno(HttpSession session) {
		return "/visualizzaTreno";
	}
	
	@GetMapping("/visualizza/{id}")
	public String visualizzaTreno(@PathVariable Integer id,HttpSession session) {
		TrenoService service = new TrenoService();
		Treno t = service.findTreno(id);
		session.setAttribute("treno", t);
		return "/visualizzaTrenoId";
	}
	
	@GetMapping("/visualizzaTreni")
	public String visualizza(Model m) {
		TrenoService service = new TrenoService();
		List<Treno> all = service.getAll();
		m.addAttribute("list",all);
		return "/visualizzaTreni";
		
	}
	
	@GetMapping("/searchByType")
	public String cerca(@RequestParam String tipo,Model m) {
		TrenoService service = new TrenoService();
		List<Treno> t = service.findForType(tipo);
		m.addAttribute("list",t);
		return "/visualizzaTreni";
	}
	


}
