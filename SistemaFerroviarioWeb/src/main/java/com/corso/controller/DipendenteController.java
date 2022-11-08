package com.corso.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.corso.services.DipendenteService;
import com.corso.services.LoginService;
import com.corso.services.TurnoService;

import corso.model.Dipendente;
import corso.model.Turno;
import corso.model.Utente;


@Controller
@RequestMapping("/home/dipendente")
public class DipendenteController {
	
	@GetMapping("/allDipendenti")
	public String allDip(Model m){
		DipendenteService d= new DipendenteService();
		List<Dipendente> lista= d.getAllDipendenti();
		m.addAttribute("dimensione", lista.size());
		m.addAttribute("lista",lista);
		return "/dipendente";
	}
	
	@GetMapping("/allDipendentiAdmin")
	public String allDipAdmin(Model m){
		DipendenteService d= new DipendenteService();
		List<Dipendente> lista= d.getAllDipendenti();
		m.addAttribute("dimensione", lista.size());
		m.addAttribute("lista",lista);
		return "/dipendenteAdmin";
	}
	
	@GetMapping("/moreDipendenti")
	public String findDip(@RequestParam List<Integer> id, Model m){
		DipendenteService d= new DipendenteService();
		List<Dipendente> lista1= d.getFindMoreDipendente(id);
		m.addAttribute("dimensione", lista1.size());
		m.addAttribute("lista",lista1);
		return "dipendente";
	}
	
	@GetMapping("/moreDipendentiAdmin")
	public String findDipAdmin(@RequestParam List<Integer> id, Model m){
		DipendenteService d= new DipendenteService();
		List<Dipendente> lista1= d.getFindMoreDipendente(id);
		m.addAttribute("dimensione", lista1.size());
		m.addAttribute("lista",lista1);
		return "dipendenteAdmin";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteDipendente(@PathVariable Integer id) {
		DipendenteService service = new DipendenteService();
		service.getRemoveDipendente(id);
		return "redirect:/home/dipendente/allDipendentiAdmin";
	}
	
	@GetMapping("visualizza/{id}")
	public String viewDipendente(@PathVariable Integer id,Model m) {
		DipendenteService service = new DipendenteService();
		TurnoService tservice = new TurnoService();
		
		Dipendente d = service.getFindDipendente(id);
		List<Turno> turni = tservice.findByDipendente(d);
		m.addAttribute("dipendente", d);
		m.addAttribute("turni", turni);
		return "visualizzaDipendente";
	}
	
	@GetMapping("/dipendentiForRuolo")
	public String findDipRuolo(@RequestParam  String ruolo, Model m){
		DipendenteService d= new DipendenteService();
		List<Dipendente> lista1= d.getFindForRuolo(ruolo);
		m.addAttribute("dimensione", lista1.size());
		m.addAttribute("lista",lista1);
		return "dipendente";
	}
	
	@GetMapping("/dipendentiForRuoloAdmin")
	public String findDipRuoloAdm(@RequestParam  String ruolo, Model m){
		DipendenteService d= new DipendenteService();
		List<Dipendente> lista1= d.getFindForRuolo(ruolo);
		m.addAttribute("dimensione", lista1.size());
		m.addAttribute("lista",lista1);
		return "dipendenteAdmin";
	}
	
	@GetMapping("/addDip")
	public String addDip() {
		return "formAddDipendente";
	}
	
	@GetMapping("/addDipendente")
	public String addDipendente(@RequestParam Integer idDipendente, @RequestParam String nome,
			@RequestParam String cognome, @RequestParam String ruolo, Model m) {
		DipendenteService dipService = new DipendenteService();
		dipService.getAddDipendente(idDipendente,nome,cognome,ruolo);
	    
		m.addAttribute("message", "Dipendente inserito con successo!");
		return "formAddDipendente";

	}
	

	@GetMapping("/associaUteDip")
	public String assUt() {
		return "associaUtenteDip";
	}
	
	
	@GetMapping("/associaDipendente")
	public String assDip(@RequestParam String user,@RequestParam Integer id, Model m) {
		LoginService ls= new LoginService();
		Utente u= ls.getUser(user);
		DipendenteService ds= new DipendenteService();
		Dipendente d= ds.getFindDipendente(id);
		ls.addDipendInUtente(u, d);
		m.addAttribute("message", "Associazione avvenuta con successo!");
		return "associaUtenteDip";
	}
	
	@GetMapping("/cercaPerNomeAdmin")
	public String findNome(@RequestParam String nome, Model m) {
		DipendenteService ds= new DipendenteService();
		List<Dipendente> l = ds.getFindByName(nome);
		m.addAttribute("dimensione", l.size());
		m.addAttribute("lista",l);
		return "dipendenteAdmin";
		
	}
	
	@GetMapping("/cercaPerCognomeAdmin")
	public String findCognome(@RequestParam String cognome, Model m) {
		DipendenteService ds= new DipendenteService();
		List<Dipendente> li = ds.getFindBySurname(cognome);
		m.addAttribute("dimensione", li.size());
		m.addAttribute("lista",li);
		return "dipendenteAdmin";
		
	}
	
	@GetMapping("/cercaPerNome")
	public String findNome2(@RequestParam String nome, Model m) {
		DipendenteService ds= new DipendenteService();
		List<Dipendente> l = ds.getFindByName(nome);
		m.addAttribute("dimensione", l.size());
		m.addAttribute("lista",l);
		return "dipendente";
		
	}
	
	@GetMapping("/cercaPerCognome")
	public String findCognome2(@RequestParam String cognome, Model m) {
		DipendenteService ds= new DipendenteService();
		List<Dipendente> li = ds.getFindBySurname(cognome);
		m.addAttribute("dimensione", li.size());
		m.addAttribute("lista",li);
		return "dipendente";
		
	}
}
