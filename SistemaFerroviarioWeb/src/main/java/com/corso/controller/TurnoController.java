package com.corso.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.corso.services.DipendenteService;
import com.corso.services.TrenoService;
import com.corso.services.TurnoService;

import corso.model.Dipendente;
import corso.model.Treno;
import corso.model.Turno;
import corso.model.Utente;

@Controller
@RequestMapping("/home/turni")
public class TurnoController {
	
	@GetMapping("/")
	public String home() {
		return "homeTurni";
	}
	
	@GetMapping("/myTurni")
	public String myTurni(HttpSession session, Model m) {
		TurnoService turnoService = new TurnoService();
		DipendenteService dipService = new DipendenteService();
		Utente u = (Utente) session.getAttribute("utente");
		List<Turno> list = turnoService.findByDipendente(dipService.
				getFindDipendente(u.getDipendente().getIdDipendente()));
		m.addAttribute("list", list);
		return "allTurni";
	}
	
	@GetMapping("/all")
	public String allTurni(Model m) {
		TurnoService service = new TurnoService();
		List<Turno> turni = service.allTurni();
		m.addAttribute("list", turni);
		return "allTurni";
	}
	
	@GetMapping("/formAdd")
	public String formAddTurno() {
		return "formAddTurno";
	}
	
	@GetMapping("/add")
	public String addTurno(@RequestParam Integer idDipendente, @RequestParam Integer idTreno,
			@RequestParam String data, Model m) {
		TurnoService turnoService = new TurnoService();
		DipendenteService dipendenteService = new DipendenteService();
		TrenoService trenoService = new TrenoService();
		Turno turno = new Turno();
		LocalDate dataTurno = LocalDate.parse(data);
		
		turno.setDipendente(dipendenteService.getFindDipendente(idDipendente));
		turno.setTreno(trenoService.findTreno(idTreno));
		turno.setDataTurno(dataTurno);
		turnoService.addTurno(turno);
		
		m.addAttribute("message", "Turno inserito con successo!");
		return "formAddTurno";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteTurno(@PathVariable Integer id) {
		TurnoService service = new TurnoService();
		service.deleteTurno(id);
		return "redirect:/home/turni/all";
	}
	
	@GetMapping("/find")
	public String find(@RequestParam Integer idTurno, Model m) {
		TurnoService service = new TurnoService();
		Turno t = service.getTurno(idTurno);
		List<Turno> list = new ArrayList<Turno>();
		
		if (t != null)
			list.add(t);
		
		m.addAttribute("list", list);
		return "allTurni";
	}
	
	@GetMapping("/findTreniByDipendente")
	public String findTreniByDipendente(@RequestParam Integer idDipendente, Model m) {
		DipendenteService dipService = new DipendenteService();
		TurnoService turnoService = new TurnoService();
		List<Treno> list = turnoService.findTreniByDipendente(dipService.getFindDipendente(idDipendente));
		m.addAttribute("list", list);
		return "printTreni";
	}
	
	@GetMapping("/findDipendentiByTreno")
	public String findDipendentiByTreno(@RequestParam Integer idTreno, Model m) {
		TrenoService trenoService = new TrenoService();
		TurnoService turnoService = new TurnoService();
		List<Dipendente> list = turnoService.findDipendentiByTreno(trenoService.findTreno(idTreno));
		m.addAttribute("list", list);
		return "printDipendenti";
	}
	
	@GetMapping("/findDipendentiByData")
	public String findDipendentiByData(@RequestParam String data, Model m) {
		TurnoService service = new TurnoService();
		LocalDate dataTurno = LocalDate.parse(data);
		List<Dipendente> list = service.findDipendentiByData(dataTurno);
		m.addAttribute("list", list);
		return "printDipendenti";
	}
	
}
