package com.corso.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.corso.services.DipendenteService;
import com.corso.services.StazioneService;
import com.corso.services.TrenoService;
import com.corso.services.TurnoService;
import com.corso.services.ViaggioService;

import corso.model.Dipendente;
import corso.model.Stazione;
import corso.model.Treno;
import corso.model.Turno;
import corso.model.Viaggio;
import corso.model.filter.ViaggioFilter;


@Controller
@RequestMapping("/home/viaggio")
public class ViaggioController {

	@GetMapping("/allViaggi")
	public String allViaggi(Model m){
		ViaggioService v= new ViaggioService();
		List<Viaggio> lista= v.getAllViaggi();
		m.addAttribute("dimensione", lista.size());
		m.addAttribute("lista",lista);
		m.addAttribute("emp", new ViaggioFilter());
		return "/viaggio";
	}
	
	@GetMapping("/formAddViaggio")
	public String formAddViaggio(Model m)
	{
		TrenoService ts = new TrenoService();
		StazioneService ss = new StazioneService();
		List<Treno> listaTreni = ts.getAll();
		List<Stazione> listaStazioni = ss.getAll();
		m.addAttribute("listaTreni", listaTreni);
		m.addAttribute("listaStazioni", listaStazioni);
		return "formAddViaggio";
	}
	
	@GetMapping("/addViaggio")
	public String addViaggio(@RequestParam(name = "treno") Integer idTreno,
			@RequestParam(name = "partenza") Integer idPartenza,
			@RequestParam(name = "arrivo") Integer idArrivo,
			@RequestParam(name = "data") String data,@RequestParam Integer idDipendente)
	{
		TrenoService trenoService = new TrenoService();
		StazioneService stazioneService = new StazioneService();
		ViaggioService viaggioService = new ViaggioService();
		DipendenteService dipendenteService = new DipendenteService();
		TurnoService turnoService = new TurnoService();
		
		Dipendente dipendente = dipendenteService.getFindDipendente(idDipendente);
		Treno treno = trenoService.findTreno(idTreno);
		Stazione partenza = stazioneService.findStazione(idPartenza);
		Stazione arrivo = stazioneService.findStazione(idArrivo);
		Date dataViaggio = Date.valueOf(LocalDate.parse(data));
		
		Viaggio viaggio = new Viaggio(partenza, arrivo, treno, dataViaggio);
		viaggio = viaggioService.add(viaggio);
		
		Turno t = new Turno();
		t.setDipendente(dipendente);
		t.setTreno(treno);
		t.setViaggio(viaggio);
		LocalDate dataTurno = LocalDate.parse(data);
		t.setDataTurno(dataTurno);
		turnoService.addTurno(t);
		return "home";
	}
	
	@GetMapping("/findViaggiByFilter")
	public String findViaggiByFilter(@ModelAttribute ViaggioFilter vf,  Model m) {


		ViaggioService v= new ViaggioService();

		
		
		List<Viaggio> lista= v.getFindByFilter(vf);
		
		m.addAttribute("dimensione", lista.size());
		m.addAttribute("lista",lista);
		
		return "/viaggioPrint";
		
		
	}
	
	
}
