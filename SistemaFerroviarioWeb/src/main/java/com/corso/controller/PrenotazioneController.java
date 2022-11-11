package com.corso.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import com.corso.services.PrenotazioneService;
import com.corso.services.ViaggioService;

import corso.model.Prenotazione;
import corso.model.Utente;
import corso.model.Viaggio;



@Controller
@RequestMapping("/home/prenotazione")
public class PrenotazioneController {

	
	@GetMapping("/pagePrenotazione")
	public String prenotazione(HttpSession session,Model m) {
		PrenotazioneService ps = new PrenotazioneService();
		Utente u = (Utente) session.getAttribute("utente");
		List<Prenotazione> list = ps.findByUsername(u.getUsername());
		m.addAttribute("list",list);
		return "/pagePrenotazione";
		
	}
	
	@GetMapping("/allPrenotazioni")
	public String prenotazione(Model m) {
		PrenotazioneService ps = new PrenotazioneService();
		List<Prenotazione> l = ps.allPrenotazioni();
		m.addAttribute("list", l);
		return "/pagePrenotazione";
		
	}
	
	@GetMapping("/addPrenotazione/{id}")
	public String addPrenotazione(HttpSession session,@PathVariable Integer id,Model m) {
		ViaggioService vs = new ViaggioService();
		Utente u = (Utente) session.getAttribute("utente");
		Viaggio v = vs.findViaggioById(id);
		PrenotazioneService ps = new PrenotazioneService();
		Prenotazione p = ps.addPrenotazione(u, v);
		if(p!=null) {
			m.addAttribute("message", "Prenotazione andata a buon fine");
			m.addAttribute("prenotazione",p);
			return "successPrenotazione";
		} else {
			m.addAttribute("message", "Posti pieni");
			return "failurePrenotazione";
		}		
		
	}
}
	

