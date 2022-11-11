package com.corso.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.corso.services.LoginService;
import com.corso.services.PrenotazioneService;
import com.corso.services.ViaggioService;

import corso.model.Prenotazione;
import corso.model.Utente;
import corso.model.Viaggio;
import corso.model.filter.ViaggioFilter;

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
	public String addPrenotazione(HttpSession session, @PathVariable Integer id, Model m) {
		Utente u= (Utente) session.getAttribute("utente");
		ViaggioService vs= new ViaggioService();
     	Viaggio v = vs.findViaggioById(id);
		PrenotazioneService ps= new PrenotazioneService();
		boolean b= ps.addPrenotazione(u, v);
		if(b)
		    m.addAttribute("message", "Prenotazione avvenuta con successo!");
		else 
			m.addAttribute("message", "Posti esauriti! Treno pieno!");
		return "/addPrenotazione"; 
	}
	
	
}
